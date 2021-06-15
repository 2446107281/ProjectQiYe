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
    //得到系统中所有找到的任务
    public List<Tasks> findAll ()
    {
        List<Tasks> tasks = tasksDAO.findAll();
        System.out.println(tasks);
        return tasks;
    }
    //系统中所有公开的任务
    public List<Tasks> findPublicTasks ()
    {
        List<Tasks> tasks = tasksDAO.findPublicTasks();
        System.out.println(tasks);
        return tasks;
    }
    //系统中所有未审核的任务
    public List<Tasks> findUnauditTasks ()
    {
        List<Tasks> tasks = tasksDAO.findUnauditTasks();
        System.out.println(tasks);
        return tasks;
    }

    //保存任务
    public void save(Tasks tasks){
        tasksDAO.save(tasks);
    }
    //通过任务id找到任务
    public Tasks findone (Integer id){
        return tasksDAO.findOne(id);
    }
    //通过发布者id找到任务
    public List<Tasks> findTasksByPublisher_id (Integer publisher_id){
        List<Tasks> tasks = tasksDAO.findTasksByPublisher_id(publisher_id);
        System.out.println(tasks);
        return tasks;
    }
    //通过跑腿小哥id找到任务
    public List<Tasks> findTasksByRunner_id (Integer runner_id){
        List<Tasks> tasks = tasksDAO.findTasksByRunner_id(runner_id);
        System.out.println(tasks);
        return tasks;
    }
    //修改任务状态
    public void updateStateByaccept (Integer task_id){tasksDAO.alterTaskStateByaccept(task_id);}
    //修改任务状态
    public void updatePublicState (Integer taskPublicState,Integer task_id){tasksDAO.alterTaskPublicState(taskPublicState,task_id);}
    //删除任务
    public void delete (Integer id){  tasksDAO.delete(id);  }
}
