package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.User;

public class UserService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory ;

    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(User user){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(user) ;
        session.getTransaction().commit();
        session.close();
        return id ;

    }
    public void delete(User user){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(user); ;
        session.getTransaction().commit();
        session.close();
    }

    public void updateUser(User user){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(user); ;
        session.getTransaction().commit();
        session.close();
    }

    public void deleteUser(User user){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(user); ;
        session.getTransaction().commit();
        session.close();
    }

    public User getUserById(Integer id){
        Session session = sessionFactory.openSession() ;
        User std = session.get(User.class , id) ;
        session.close();
        return std ;
    }




}
