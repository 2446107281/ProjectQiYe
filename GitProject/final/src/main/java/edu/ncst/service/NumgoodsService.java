package edu.ncst.service;

import edu.ncst.dao.NumgoodsDAO;
import edu.ncst.entity.Numgoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//业务
@Transactional
//事务和业务有区别，对数据库的操作有时一个业务里有多个操作 业务一般后台的
public class NumgoodsService {
    //service的意义是隔离controller和dao，最好不要用controller直接访问数据库
    //业务逻辑层

    @Autowired
    private NumgoodsDAO numgoodsDAO;

    public Numgoods add(Numgoods goods){
        return numgoodsDAO.save(goods);
    }

    public List<Numgoods> getAllNumgoods(){
        return numgoodsDAO.findAll();
    }

    public Numgoods findone(Integer id)
    {
        return numgoodsDAO.findOne(id);
    }

    public Numgoods delete(Integer id){
        Numgoods p = numgoodsDAO.findOne(id);
        if (p!=null)
            numgoodsDAO.delete(id);
        return p;
    }
}
