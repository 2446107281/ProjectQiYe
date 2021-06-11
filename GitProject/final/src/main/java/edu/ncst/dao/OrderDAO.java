package edu.ncst.dao;


import edu.ncst.entity.Customer;
import edu.ncst.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order,Integer>
{ }