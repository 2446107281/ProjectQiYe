package edu.ncst.service;

import edu.ncst.dao.IngoodsDAO;
import edu.ncst.dao.OutgoodsDAO;
import edu.ncst.entity.Outgoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//业务
@Transactional
//事务和业务有区别，对数据库的操作有时一个业务里有多个操作 业务一般后台的
public class OutgoodsService {
    //service的意义是隔离controller和dao，最好不要用controller直接访问数据库
    //业务逻辑层

    @Autowired
    private OutgoodsDAO outgoodsDAO;

    public Outgoods add(Outgoods outgoods){
        return outgoodsDAO.save(outgoods);
    }

    public List<Outgoods> getAllOutgoods(){
        return outgoodsDAO.findAll();
    }

    public Outgoods findone(Integer id)
    {
        return outgoodsDAO.findOne(id);
    }

    public Outgoods delete(Integer id){
        Outgoods p = outgoodsDAO.findOne(id);
        if (p!=null)
            outgoodsDAO.delete(id);
        return p;
    }
}
