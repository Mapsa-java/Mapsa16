package org.mapsa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapsa.entities.User;

public class Demo {


    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

            txn = session.beginTransaction();
            //--------------------------
            User user = new User("test") ;
            session.save(user) ;

            //--------------------------
            txn.commit();

        } catch (Exception exception) {
            exception.printStackTrace();
            txn.rollback();
        }

    }


}
