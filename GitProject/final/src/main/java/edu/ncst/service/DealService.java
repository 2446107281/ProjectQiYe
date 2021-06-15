package edu.ncst.service;

import edu.ncst.dao.DealDAO;
import edu.ncst.entity.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DealService {
    @Autowired//自动注入项目中的PublisherDAO
    private DealDAO dealDAO;

    public List<Deal> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Deal> deals = dealDAO.findAll();
        System.out.println(deals);
        return deals;
    }

    public void save(Deal deal){
        dealDAO.save(deal);
    }

    public Deal findone (Integer id){
        return dealDAO.findOne(id);
    }

    public void delete (Integer id){  dealDAO.delete(id);  }

    public void deleteBytask_id (Integer task_id){  dealDAO.deleteBytask_id(task_id);  }

    public Integer findRunner_idBytask_id(Integer task_id){return dealDAO.findRunner_idBytask_id(task_id);}
}
