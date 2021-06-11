package edu.ncst.service;

import edu.ncst.dao.CustomerDAO;
import edu.ncst.dao.OrderDAO;
import edu.ncst.entity.Customer;
import edu.ncst.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired//自动注入
    private OrderDAO orderDAO;

    public List<Order> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Order> orders = orderDAO.findAll();
        return orders;
    }

    public void save(Order order){

        orderDAO.save(order);
    }

    public Order findone (Integer id){
        return orderDAO.findOne(id);
    }

    public void delete (Integer id){  orderDAO.delete(id);  }


}
