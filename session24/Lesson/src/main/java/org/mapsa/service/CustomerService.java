package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.mapsa.entities.Customer;

import java.util.List;

public class CustomerService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory ;

    public CustomerService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(Customer customer){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        Integer id =(Integer) session.save(customer) ;
        session.getTransaction().commit();
        session.close();
        return id ;

    }
    public void delete(Customer customer){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(customer); ;
        session.getTransaction().commit();
        session.close();
    }

    public void updateCustomer(Customer customer){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(customer); ;
        session.getTransaction().commit();
        session.close();
    }

    public void deleteCustomer(Customer customer){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(customer); ;
        session.getTransaction().commit();
        session.close();
    }

    public Customer getCustomerById(Integer id){
        Session session = sessionFactory.openSession() ;
        Customer std = session.get(Customer.class , id) ;
        session.close();
        return std ;
    }


    public List<Customer> getAll(){
        Session session = sessionFactory.openSession() ;
        Query q = session.createQuery("Select u  from Customer u") ;

        List<Customer> customers =  q.getResultList() ;
        session.close();
        return customers;
    }


    public List<Customer> getByName(String input){
        Session session = sessionFactory.openSession() ;
        Query q = session.createQuery("Select u  from Customer u where u.name = :name ") ;
        q.setParameter("name" ,input ) ;
        List<Customer> customers =  q.getResultList() ;

        session.close();
        return customers;
    }





}
