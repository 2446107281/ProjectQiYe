package edu.ncst.controller;

import edu.ncst.entity.Tasks;
import edu.ncst.service.TaskService;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

//controller三个功能 接受用户的输入，调用业务层完成相应的功能,返回页面相应数据
@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    //注入TaskService

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index( Integer publisher_id,Model model){
        List<Tasks> tasks = taskService.findTasksByPublisher_id(publisher_id);//调用业务层
        model.addAttribute("tasks",tasks);//传递数据
        model.addAttribute("publisher_id",publisher_id);
        return "taskhall_publisher";//返回网页
    }

    @RequestMapping(value = "/runner",method = RequestMethod.GET)
    public String runnerindex(Model model){
        List<Tasks> tasks = taskService.findPublicTasks();//调用业务层
        model.addAttribute("tasks",tasks);//传递数据
        return "taskhall_runner";//返回网页
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit( Integer publisher_id, Model model)
    {
        Tasks task = new Tasks();
        task.setPublisher_id(publisher_id);
        task.setTaskState(1);
        model.addAttribute("entity",task);//传递数据
        return "task_edit";
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Tasks task, Model model)
    {
        taskService.save(task);
        List<Tasks> tasks = taskService.findTasksByPublisher_id(task.getPublisher_id());//调用业务层
        model.addAttribute("tasks",tasks);//传递数据
        return "taskhall_publisher";
    }

}
