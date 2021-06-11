package edu.ncst.service;

import edu.ncst.dao.ProductDAO;
import edu.ncst.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//业务
@Transactional
//事务和业务有区别，对数据库的操作有时一个业务里有多个操作 业务一般后台的
public class ProductService {
    //service的意义是隔离controller和dao，最好不要用controller直接访问数据库
    //业务逻辑层

    @Autowired
    private ProductDAO productDAO;

    public Product add(Product product){
        return productDAO.save(product);
    }

    public List<Product> getAllProduct(){
        return productDAO.findAll();
    }

    public Product delete(Integer id){
        Product p = productDAO.findOne(id);
        if (p!=null)
            productDAO.delete(id);
        return p;
    }

    public Product findone(Integer id)
    {
        return productDAO.findOne(id);
    }
}
