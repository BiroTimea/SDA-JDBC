package com.sda.timea.hibernate.repository;

import com.sda.timea.hibernate.model.Project;
import com.sda.timea.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectRepository {

    public Project findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id
        Project project = session.find(Project.class, id);
        session.close();
        return project;
    }

    public void save(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(project);
        transaction.commit();
        session.close();
    }

    public void delete(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(project);
        transaction.commit();
        session.close();
    }

    public void update(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(project);
        transaction.commit();
        session.close();
    }


}
