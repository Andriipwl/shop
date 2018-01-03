package ua.com.owu.service;

import ua.com.owu.entity.Client;
import ua.com.owu.entity.Product;

import java.util.List;

public interface ClientService {

    void save(Client client);

    List<Client> findAll();
    Product find(int id);

}
