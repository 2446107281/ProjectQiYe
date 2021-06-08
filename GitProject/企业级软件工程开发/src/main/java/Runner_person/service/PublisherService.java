package Runner_person.service;

import Runner_person.dao.PublisherDAO;
import Runner_person.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired//自动注入项目中的PublisherDAO
    private PublisherDAO publisherDAO;

    public List<Publisher> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Publisher> publishers = publisherDAO.findAll();
        System.out.println(publishers);
        return publishers;
    }

    public void save(Publisher publisher){
        publisherDAO.save(publisher);
    }

    public Publisher findone (Integer id){
        return publisherDAO.findOne(id);
    }

    public void delete (Integer id){  publisherDAO.delete(id);  }


    public Publisher login(Integer Useraccount,String Password)
    {
        List<Publisher> publishers = publisherDAO.findByUserAccountAndPassword(Useraccount,Password);
        if (publishers.size()>0)
        {
            return publishers.get(0);
        }
        return null;
    }
}
