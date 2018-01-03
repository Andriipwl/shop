package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.ProductDao;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public Product findById(int id) {
        return productDao.findOne(id);
    }

    @Override
    public List<Product> sortByLowPrice() {
        return productDao.sortByLowPrice();
    }

    @Override
    public List<Product> sortByHighPrice() {
        return productDao.sortByHighPrice();
    }

    @Override
    public List<Product> findByName(String name) {
        return productDao.findByName(name);
    }
}
