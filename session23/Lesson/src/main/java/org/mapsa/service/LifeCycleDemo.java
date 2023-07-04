package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapsa.SessionFactoryProvider;
import org.mapsa.entities.Permission;

public class LifeCycleDemo {

    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

            txn = session.beginTransaction();
            //--------------------------
       /*     Permission editPerson = session.get(Permission.class , 2) ; //persistent
            System.out.println(editPerson.getName());

            session.remove(editPerson); //removed
            System.out.println("after remove----------------");*/


            Permission viewCustomerpermission = new Permission("edit customer"); //Transient - new
            System.out.println("expected fo be false : "+ session.contains(viewCustomerpermission));
            session.save(viewCustomerpermission) ; //persistent

            System.out.println("expected fo be true : "+ session.contains(viewCustomerpermission));
            session.evict(viewCustomerpermission);
           // session.remove(viewCustomerpermission);

            System.out.println("expected fo be false(after evit) : "+ session.contains(viewCustomerpermission));



            //--------------------------
            txn.commit();

        } catch (Exception exception) {
            txn.rollback();
        }

    }
}
