package org.mapsa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapsa.entities.single.InstructorSingle;
import org.mapsa.entities.single.StudentSingle;
import org.mapsa.entities.single.UserSingle;

import java.math.BigDecimal;

public class DemoSingle {


    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

            txn = session.beginTransaction();
            //--------------------------
            UserSingle user = new UserSingle("baseUser");
            StudentSingle std = new StudentSingle("Jan", "hibernate");
            InstructorSingle ins = new InstructorSingle("Pooya", new BigDecimal(12_000_000));

            session.save(user);
            session.save(ins);
            session.save(std);

            //--------------------------
            txn.commit();

        } catch (Exception exception) {
            exception.printStackTrace();
            txn.rollback();
        }

    }


}
