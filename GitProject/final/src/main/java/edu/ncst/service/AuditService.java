package edu.ncst.service;

import edu.ncst.dao.AuditDAO;
import edu.ncst.entity.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuditService {
    @Autowired//自动注入项目中的PublisherDAO
    private AuditDAO auditDAO;

    public List<Audit> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Audit> audits = auditDAO.findAll();
        System.out.println(audits);
        return audits;
    }

    public void save(Audit deals){
        auditDAO.save(deals);
    }

    public Audit findone (Integer id){
        return auditDAO.findOne(id);
    }

    public void delete (Integer id){  auditDAO.delete(id);  }

}
