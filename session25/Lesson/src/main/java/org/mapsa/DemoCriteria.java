package org.mapsa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.mapsa.entities.joined.UserJoined;

import java.util.List;

public class DemoCriteria {


    public static void main(String[] args) {
        Transaction txn = null;

        try (SessionFactory sf = SessionFactoryProvider.getSessionFactory();
             Session session = sf.openSession();
        ) {

          /*  Criteria criteria = session.createCriteria(UserSingle.class) ;
            criteria.add(Restrictions.eq("name" , "Jan")) ;
            List<UserSingle> l = criteria.list();
            System.out.println(l.size());
            l.forEach(item-> System.out.println(item.getName()));*/



           Criteria criteria2 = session.createCriteria(UserJoined.class) ;
            criteria2.add(
                    Restrictions.and(
                            Restrictions.eq("age" , 20) ,
                            Restrictions.like("name" , "jun" , MatchMode.ANYWHERE)

                    )

                   ) ;
            List<UserJoined> l2 = criteria2.list();
            System.out.println(l2.size());
            l2.forEach(item-> System.out.println(item.getName()));

        } catch (Exception exception) {
            exception.printStackTrace();
            txn.rollback();
        }

    }


}
