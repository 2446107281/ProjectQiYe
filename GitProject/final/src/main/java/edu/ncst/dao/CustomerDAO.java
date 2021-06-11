package edu.ncst.dao;


import edu.ncst.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Integer>
{

   public List<Customer> findByUserNameAndPassword(String userName,String password);
}