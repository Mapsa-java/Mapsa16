package org.mapsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.User;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(User.class);
            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
