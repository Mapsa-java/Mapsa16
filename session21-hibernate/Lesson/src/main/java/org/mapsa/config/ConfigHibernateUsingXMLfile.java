package org.mapsa.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.Student;

import java.util.List;

public class ConfigHibernateUsingXMLfile {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        List<Student> list =  session.createQuery("from Student").getResultList();
        System.out.println(list);
        session.close();



    }
}
