package edu.ncst.dao;


import edu.ncst.entity.Numgoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumgoodsDAO extends JpaRepository<Numgoods, Integer>{

}
