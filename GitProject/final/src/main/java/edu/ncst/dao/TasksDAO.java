package edu.ncst.dao;


import edu.ncst.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public interface TasksDAO extends JpaRepository<Tasks,Integer>{

}
