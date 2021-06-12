package edu.ncst.service;

import edu.ncst.dao.TasksDAO;
import edu.ncst.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired//自动注入项目中的PublisherDAO
    private TasksDAO tasksDAO;

    public List<Tasks> findAll ()//第一个业务得到系统中所有找到的用户消费者
    {
        List<Tasks> tasks = tasksDAO.findAll();
        System.out.println(tasks);
        return tasks;
    }

    public void save(Tasks tasks){
        tasksDAO.save(tasks);
    }

    public Tasks findone (Integer id){
        return tasksDAO.findOne(id);
    }

    public void delete (Integer id){  tasksDAO.delete(id);  }
}
