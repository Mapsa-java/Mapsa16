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

    public void updateStudent(Student student){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(student); ;
        session.getTransaction().commit();
        session.close();
    }

    public void deleteStudent(Student student){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(student); ;
        session.getTransaction().commit();
        session.close();
    }

    public Student getStudentById(Integer id){
        Session session = sessionFactory.openSession() ;
        Student std = session.get(Student.class , id) ;
        session.close();
        return std ;
    }




}
