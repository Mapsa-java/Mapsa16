package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.Role;

public class RoleService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory ;

    public RoleService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(Role role){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(role) ;
        session.getTransaction().commit();
        session.close();
        return id ;

    }

    public void update(Role role){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(role); ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Role role){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(role); ;
        session.getTransaction().commit();
        session.close();
    }

    public Role getById(Integer id){
        Session session = sessionFactory.openSession() ;
        Role role = session.get(Role.class , id) ;
        session.close();
        return role ;
    }




}
