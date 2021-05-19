package com.sda.timea.hibernate3;

import com.sda.timea.hibernate3.model.Client;
import com.sda.timea.hibernate3.repository.ClientRepository;
import com.sda.timea.hibernate3.utils.SessionManager3;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        ClientRepository clientRepository = new ClientRepository();

        Client client1 = new Client("Kuro", "Neko", "kurone@bitcoin.com", Date.valueOf("1976-03-11"));
        Client client2 = new Client("Shiro", "Ren", "shiren@yahoo.com", Date.valueOf("1969-06-22"));

        clientRepository.save(client1);
        clientRepository.save(client2);

        clientRepository.findAll().forEach(client -> System.out.println(client));

        SessionManager3.shutDown();
    }
}
