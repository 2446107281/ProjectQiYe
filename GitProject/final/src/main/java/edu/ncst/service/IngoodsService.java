package edu.ncst.service;

import edu.ncst.dao.IngoodsDAO;
import edu.ncst.entity.Ingoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//业务
@Transactional
//事务和业务有区别，对数据库的操作有时一个业务里有多个操作 业务一般后台的
public class IngoodsService {
    //service的意义是隔离controller和dao，最好不要用controller直接访问数据库
    //业务逻辑层

    @Autowired
    private IngoodsDAO ingoodsDAO;

    public Ingoods add(Ingoods ingoods){
        return ingoodsDAO.save(ingoods);
    }

    public List<Ingoods> getAllIngoods(){
        return ingoodsDAO.findAll();
    }

    public Ingoods findone(Integer id)
    {
        return ingoodsDAO.findOne(id);
    }

    public Ingoods delete(Integer id){
        Ingoods p = ingoodsDAO.findOne(id);
        if (p!=null)
            ingoodsDAO.delete(id);
        return p;
    }
}
