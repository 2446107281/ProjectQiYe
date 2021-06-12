package edu.ncst.service;

import edu.ncst.dao.RunnersDAO;
import edu.ncst.entity.Runners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RunnerService {
    @Autowired//自动注入项目中的ManagersDAO
    private RunnersDAO runnersDAO;

    public List<Runners> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Runners> runner = runnersDAO.findAll();
        System.out.println(runner);
        return runner;
    }

    public void save(Runners publisher){
        runnersDAO.save(publisher);
    }

    public Runners findone (Integer id){
        return runnersDAO.findOne(id);
    }

    public void delete (Integer id){  runnersDAO.delete(id);  }

    public Runners login(Integer userName,String password)
    {
        List<Runners> runners = runnersDAO.findByUserNameAndPassword(userName,password);
        if (runners.size()>0)
        {
            return runners.get(0);
        }
        return null;
    }
}
