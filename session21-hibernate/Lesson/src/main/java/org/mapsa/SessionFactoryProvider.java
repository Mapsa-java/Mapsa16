package org.mapsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.configure();

            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
