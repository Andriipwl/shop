package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.OrderedProduct;

public interface OrderDao extends JpaRepository<OrderedProduct,Integer> {

}
