package edu.ncst.dao;


import edu.ncst.entity.Runners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface RunnersDAO extends JpaRepository<Runners,Integer> {
    public List<Runners> findByUserNameAndPassword(Integer userName, String password);
}
