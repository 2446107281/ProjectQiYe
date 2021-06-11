package edu.ncst.dao;


import edu.ncst.entity.Ingoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngoodsDAO extends JpaRepository<Ingoods, Integer>{

}
