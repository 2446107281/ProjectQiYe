package edu.ncst.service;

import edu.ncst.dao.CustomerDAO;
import edu.ncst.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired//自动注入
    private CustomerDAO customerDAO;

    public List<Customer> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Customer> customers = customerDAO.findAll();
        return customers;
    }

    public void save(Customer customer){
        customerDAO.save(customer);
    }

    public Customer findone (Integer id){
        return customerDAO.findOne(id);
    }

    public void delete (Integer id){  customerDAO.delete(id);  }


    public Customer login(String userName,String password)
    {
        List<Customer> customers = customerDAO.findByUserNameAndPassword(userName, password);
        if (customers.size()>0)
        {
            return customers.get(0);
        }
        return null;
    }
}
