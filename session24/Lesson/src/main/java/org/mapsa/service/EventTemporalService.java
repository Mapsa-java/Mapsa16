package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.EventTemporal;

public class EventTemporalService {
    //crud  c : create , r : read , u : update , d : delete
    SessionFactory sessionFactory ;
    public EventTemporalService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(EventTemporal event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(event) ;
        session.getTransaction().commit();
        session.close();
        return id ;
    }
    public void update(EventTemporal event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(event); ;
        session.getTransaction().commit();
        session.close();
    }
    public void delete(EventTemporal event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(event); ;
        session.getTransaction().commit();
        session.close();
    }
    public EventTemporal getById(Integer id){
        Session session = sessionFactory.openSession() ;
        EventTemporal event = session.get(EventTemporal.class , id) ;
        session.close();
        return event ;
    }
}
