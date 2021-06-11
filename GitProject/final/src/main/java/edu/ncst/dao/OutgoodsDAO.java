package edu.ncst.dao;


import edu.ncst.entity.Outgoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutgoodsDAO extends JpaRepository<Outgoods, Integer>{

}
