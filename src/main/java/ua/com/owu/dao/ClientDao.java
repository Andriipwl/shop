package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.owu.entity.Client;

public interface ClientDao extends JpaRepository<Client,Integer> {

}
