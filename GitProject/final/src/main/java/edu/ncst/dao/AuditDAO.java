package edu.ncst.dao;

import edu.ncst.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public interface AuditDAO extends JpaRepository<Audit,Integer>{
}
