package edu.ncst.controller;

import edu.ncst.entity.Deal;
import edu.ncst.entity.Tasks;
import edu.ncst.service.DealService;
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
@RequestMapping("/deal")
public class DealControl {
    @Autowired
    private TaskService taskService;

    @Autowired
    private DealService dealService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Deal> deals = dealService.findAll();//调用业务层
        model.addAttribute("deals",deals);//传递数据
        return "deal_index";//返回网页
    }

    @RequestMapping(value = "/accept",method = RequestMethod.GET)
    public String edit(Integer task_id ,Model model){
        Deal deal = new Deal();
        deal.setTask_id(task_id);
        model.addAttribute("entity",deal);
        return "deal_accept";//返回网页
    }

    @RequestMapping(value = "/accept",method = RequestMethod.POST)
    public String editsave(Deal deal ,Model model){
        dealService.save(deal);
        List<Tasks> tasks = taskService.findTasksByRunner_id(deal.getRunner_id());//调用业务层
        model.addAttribute("tasks",tasks);//传递数据
        return "runnertask";//返回网页

    }
}
