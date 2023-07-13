package org.mapsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.joined.InstructorJoined;
import org.mapsa.entities.joined.StudentJoined;
import org.mapsa.entities.joined.UserJoined;
import org.mapsa.entities.single.InstructorSingle;
import org.mapsa.entities.single.StudentSingle;
import org.mapsa.entities.single.UserSingle;
import org.mapsa.entities.perclass.InstructorPerClass;
import org.mapsa.entities.perclass.StudentPerClass;
import org.mapsa.entities.perclass.UserPerClass;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(UserSingle.class);
            cfg.addAnnotatedClass(StudentSingle.class);
            cfg.addAnnotatedClass(InstructorSingle.class);
            cfg.addAnnotatedClass(StudentPerClass.class);
            cfg.addAnnotatedClass(UserPerClass.class);
            cfg.addAnnotatedClass(InstructorPerClass.class);
            cfg.addAnnotatedClass(UserJoined.class);
            cfg.addAnnotatedClass(InstructorJoined.class);
            cfg.addAnnotatedClass(StudentJoined.class);
            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
