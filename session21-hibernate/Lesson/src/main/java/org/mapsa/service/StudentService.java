package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.Student;

public class StudentService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory ;

    public StudentService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer createStudent(Student student){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(student) ;
        session.getTransaction().commit();
        return id ;

    }

}
