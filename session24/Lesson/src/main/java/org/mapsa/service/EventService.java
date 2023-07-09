package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.Event;

public class EventService {
    //crud  c : create , r : read , u : update , d : delete
    SessionFactory sessionFactory ;
    public EventService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(Event event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(event) ;
        session.getTransaction().commit();
        session.close();
        return id ;
    }
    public void update(Event event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(event); ;
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Event event){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(event); ;
        session.getTransaction().commit();
        session.close();
    }
    public Event getById(Integer id){
        Session session = sessionFactory.openSession() ;
        Event event = session.get(Event.class , id) ;
        session.close();
        return event ;
    }
}
