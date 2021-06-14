package edu.ncst.controller;

import edu.ncst.entity.Publishers;
import edu.ncst.entity.Tasks;
import edu.ncst.service.PublisherService;
import edu.ncst.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

//controller三个功能 接受用户的输入，调用业务层完成相应的功能,返回页面相应数据
@Controller
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private PublisherService publisherService;
    //注入PublisherService

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Publishers> publishers = publisherService.findAll();//调用业务层
        model.addAttribute("publishers",publishers);//传递数据
        return "publisher_index";//返回网页
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit(Integer id, Model model)
    {
        if (id == null){
            Publishers publisher = new Publishers();
            model.addAttribute("entity",publisher);
        }
        else{
            Publishers publisher = publisherService.findone(id);
            model.addAttribute("entity",publisher);
        }
        return "publisher_edit";
    }
    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Publishers publisher, Model model)
    {
        publisherService.save(publisher);
        model.addAttribute("entity",publisher);
        return "publisher_edit";
    }



    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Publishers publisher, HttpSession session,Model model)
    {
        Publishers c = publisherService.login(publisher.getUserName(),publisher.getPassword());
        if (c!=null){
            session.setAttribute("publisher",c);
            model.addAttribute("entity",c);
            return "publisher_edit";
        }
        return "login";
    }
}
