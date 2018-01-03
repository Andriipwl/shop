package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.ClientDao;
import ua.com.owu.dao.ProductDao;
import ua.com.owu.entity.Client;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ClientService;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDao clientDao;
    @Autowired
    private ProductDao productDao;

    public void save(Client client) {
        clientDao.save(client);
    }
    public List<Client> findAll(){
        return clientDao.findAll();
    }

    @Override
    public Product find(int id) {
        return productDao.findOne(id);
    }
}