package org.mapsa.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.Student;

public class ConfigHibernateUsingConfiguration {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.setProperty(AvailableSettings.URL, "jdbc:mysql://localhost:3306/mapsa?useSSL=false");
        cfg.setProperty(AvailableSettings.USER, "root");
        cfg.setProperty(AvailableSettings.PASS, "12345678");
        cfg.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        cfg.addAnnotatedClass(Student.class);
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();


        session.close();


    }
}