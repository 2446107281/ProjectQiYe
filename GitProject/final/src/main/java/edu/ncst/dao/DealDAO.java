package edu.ncst.dao;
import edu.ncst.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public interface DealDAO extends JpaRepository<Deal,Integer>{

}
