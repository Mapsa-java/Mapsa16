package org.mapsa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapsa.entities.joined.InstructorJoined;
import org.mapsa.entities.joined.StudentJoined;
import org.mapsa.entities.joined.UserJoined;

import java.math.BigDecimal;

public class DemoJoined {


    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

            txn = session.beginTransaction();
            //--------------------------
            UserJoined user = new UserJoined("join user", 18) ;
            StudentJoined std = new StudentJoined("joined jun"  , 20 , "Spring") ;
            InstructorJoined ins = new InstructorJoined("Joined Ashkan", 28 , new BigDecimal(15_000_000));


            session.save(user);
            session.save(std);
            session.save(ins);

            //--------------------------
            txn.commit();

        } catch (Exception exception) {
            exception.printStackTrace();
            txn.rollback();
        }

    }


}
