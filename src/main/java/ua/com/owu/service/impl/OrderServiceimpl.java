package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.OrderDao;
import ua.com.owu.entity.OrderedProduct;
import ua.com.owu.service.OrderService;
@Service
@Transactional
public class OrderServiceimpl implements OrderService{
    @Autowired
    private OrderDao orderDao;
    @Override
    public void save(OrderedProduct product) {
        orderDao.save(product);
    }
}
