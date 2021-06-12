package edu.ncst.service;

import edu.ncst.dao.ManagersDAO;
import edu.ncst.entity.Managers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManagerService {
    @Autowired//自动注入项目中的ManagersDAO
    private ManagersDAO managersDAO;

    public List<Managers> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Managers> managers = managersDAO.findAll();
        System.out.println(managers);
        return managers;
    }

    public void save(Managers manager){
        managersDAO.save(manager);
    }

    public Managers findone (Integer id){
        return managersDAO.findOne(id);
    }

    public void delete (Integer id){  managersDAO.delete(id);  }

    public Managers login(Integer userName,String password)
    {
        List<Managers> managers = managersDAO.findByUserNameAndPassword(userName,password);
        if (managers.size()>0)
        {
            return managers.get(0);
        }
        return null;
    }

}
