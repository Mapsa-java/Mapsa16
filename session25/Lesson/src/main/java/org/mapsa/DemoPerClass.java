package org.mapsa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapsa.entities.perclass.InstructorPerClass;
import org.mapsa.entities.perclass.StudentPerClass;
import org.mapsa.entities.perclass.UserPerClass;

import java.math.BigDecimal;

public class DemoPerClass {


    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

            txn = session.beginTransaction();
            //--------------------------
            UserPerClass user = new UserPerClass("baseUser") ;
            StudentPerClass std = new StudentPerClass("jun" , "Spring") ;
            InstructorPerClass ins = new InstructorPerClass("Ashkan" , new BigDecimal(15_000_000));


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
