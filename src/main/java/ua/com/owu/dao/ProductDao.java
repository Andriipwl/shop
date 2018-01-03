package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.security.access.method.P;
import ua.com.owu.entity.Product;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    @Query( value = "SELECT* FROM Product  ORDER BY prise  ASC ",nativeQuery = true)
     List<Product> sortByLowPrice();
    @Query(value = "SELECT* FROM Product ORDER BY prise DESC ",nativeQuery = true)
     List<Product> sortByHighPrice();
    @Query( value = "SELECT* FROM Product p where p.name LIKE  :name%",nativeQuery = true)
    List<Product> findByName(@Param("name") String name);



}
