package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.Credential;

public class CredentialService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory ;

    public CredentialService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(Credential credential){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(credential) ;
        session.getTransaction().commit();
        session.close();
        return id ;

    }

    public void update(Credential credential){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(credential); ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Credential credential){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(credential); ;
        session.getTransaction().commit();
        session.close();
    }

    public Credential getById(Integer id){
        Session session = sessionFactory.openSession() ;
        Credential std = session.get(Credential.class , id) ;
        session.close();
        return std ;
    }




}
