package org.mapsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.*;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(User.class);
            cfg.addAnnotatedClass(Credential.class);
            cfg.addAnnotatedClass(Address.class) ;
            cfg.addAnnotatedClass(Permission.class);
            cfg.addAnnotatedClass(Role.class);
            cfg.addAnnotatedClass(Event.class);
            cfg.addAnnotatedClass(EventTemporal.class);
            cfg.addAnnotatedClass(Customer.class);
            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
