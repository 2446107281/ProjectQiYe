package edu.ncst.service;

import edu.ncst.dao.GoodsDAO;
import edu.ncst.entity.Goods;
import edu.ncst.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//业务
@Transactional
//事务和业务有区别，对数据库的操作有时一个业务里有多个操作 业务一般后台的
public class GoodsService {
    //service的意义是隔离controller和dao，最好不要用controller直接访问数据库
    //业务逻辑层

    @Autowired
    private GoodsDAO goodsDAO;

    public Goods add(Goods goods){
        return goodsDAO.save(goods);
    }

    public List<Goods> getAllGoods(){
        return goodsDAO.findAll();
    }

    public Goods findone(Integer id)
    {
        return goodsDAO.findOne(id);
    }

    public Goods delete(Integer id){
        Goods p = goodsDAO.findOne(id);
        if (p!=null)
            goodsDAO.delete(id);
        return p;
    }
}
