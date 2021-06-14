package edu.ncst.controller;

import edu.ncst.entity.Runners;
import edu.ncst.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/runner")
public class RunnerController {
    @Autowired
    private RunnerService runnerService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Runners> runners = runnerService.findAll();//调用业务层
        model.addAttribute("runners",runners);//传递数据
        return "runner_index";//返回网页
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login()
    {
        return "runner_login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Runners runner, HttpSession session, Model model){
        Runners c = runnerService.login(runner.getUserName(),runner.getPassword());
        if (c!=null){
            session.setAttribute("runner",c);
            model.addAttribute("entity",c);
            return "runner_home";
        }
        return "runner_login";
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit(Integer id, Model model)
    {
        if (id == null){
            Runners runner = new Runners();
            model.addAttribute("entity",runner);
        }
        else{
            Runners runner = runnerService.findone(id);
            model.addAttribute("entity",runner);
        }
        return "runner_home";
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Runners runner, Model model)
    {
        runnerService.save(runner);
        model.addAttribute("entity",runner);
        return "runner_home";
    }

//    //查看所有任务
//    @RequestMapping(value = "/searchTasks", method = RequestMethod.GET)
//    public String searchTasks(HttpSession session){
//        return "allTasks";
//    }

    //查找跑腿已接受的任务
//    @RequestMapping(value = "/searchMyTasks", method = RequestMethod.GET)
//    public String searchMyTasks(HttpSession session){
//        //获取跑腿者
//        Runners runner = (Runners) session.getAttribute("runner");
//        //获取id
//        Integer runner_id = runner.getRunner_id();
//        //需要查任务
//        return "runner_task";
    }

//    @RequestMapping(value = "myInfo", method = RequestMethod.GET)
//    public String myInfo(Model model, HttpSession session){
//
//        model.addAttribute("runner", (Runners)session.getAttribute("runner"));

//        //获取跑腿者
//        Runners runner = (Runners) session.getAttribute("runner");
//        //获取id
//        Integer runner_id = runner.getRunner_id();
//        Runners runners = runnerService.findone(runner_id);
//        model.addAttribute("runner",runners);
//        return "runner_info";
//    }

