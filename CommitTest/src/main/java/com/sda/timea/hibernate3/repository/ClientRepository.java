package com.sda.timea.hibernate3.repository;

import com.sda.timea.hibernate3.model.Client;
import com.sda.timea.hibernate3.utils.SessionManager3;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientRepository {

    public Client findById(Integer id){
        Session session = SessionManager3.getSessionFactory().openSession();
        Client client = session.find(Client.class,id);
        session.close();
        return client;
    }

    public void save(Client client){
        Session session = SessionManager3.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    public Set<Client> findAll(){
        Session session = SessionManager3.getSessionFactory().openSession();
        List<Client> result = session.createQuery("select c from Client c").getResultList();
        session.close();
        return new HashSet<>(result);
    }
}
