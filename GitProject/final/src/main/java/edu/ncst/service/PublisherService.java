package edu.ncst.service;

import edu.ncst.dao.PublisherDAO;
import edu.ncst.entity.Publishers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired//自动注入项目中的PublisherDAO
    private PublisherDAO publisherDAO;

    public List<Publishers> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Publishers> publishers = publisherDAO.findAll();
        System.out.println(publishers);
        return publishers;
    }

    public void save(Publishers publisher){
        publisherDAO.save(publisher);
    }

    public Publishers findone (Integer id){
        return publisherDAO.findOne(id);
    }

    public void delete (Integer id){  publisherDAO.delete(id);  }


    public Publishers login(Integer userName,String password)
    {
        List<Publishers> publishers = publisherDAO.findByUserNameAndPassword(userName,password);
        if (publishers.size()>0)
        {
            return publishers.get(0);
        }
        return null;
    }
}
