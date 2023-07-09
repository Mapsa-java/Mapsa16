package org.mapsa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.mapsa.entities.Permission;

import java.util.List;


public class PermissionService {
    //crud  c : create , r : read , u : update , d : delete

    SessionFactory sessionFactory;

    public PermissionService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer create(Permission permission) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(permission);
        session.getTransaction().commit();
        session.close();
        return id;

    }

    public void update(Permission permission) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(permission);
        ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Permission permission) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(permission);
        ;
        session.getTransaction().commit();
        session.close();
    }

    public Permission getById(Integer id) {
        Session session = sessionFactory.openSession();
        Permission permission = session.get(Permission.class, id);
        session.close();
        return permission;
    }

    public Permission findByName(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Permission where name=:name");
        query.setParameter("name", name);
        List<Permission> permissions = query.list();
        session.close();
        if (permissions.size() > 0)
            return permissions.get(0);
        else
            return null;
    }


}
