package edu.ncst.dao;

import edu.ncst.entity.Managers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface ManagersDAO extends JpaRepository<Managers,Integer>{
    public List<Managers> findByUserNameAndPassword(Integer userName, String password);
}
