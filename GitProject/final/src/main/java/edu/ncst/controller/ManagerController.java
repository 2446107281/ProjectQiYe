package edu.ncst.controller;

import edu.ncst.entity.Managers;
import edu.ncst.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/managers")
public class ManagerController {

    @Autowired
    private ManagerService managementService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Managers> managers = managementService.findAll();//调用业务层
        model.addAttribute("managers",managers);//传递数据
        return "manager_index";//返回网页
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit(Integer id, Model model)
    {
        if (id == null){
            Managers manager = new Managers();
            model.addAttribute("entity",manager);
        }
        else{
            Managers manager = managementService.findone(id);
            model.addAttribute("entity",manager);
        }
        return "manager_edit";
    }
    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Managers manager, Model model)
    {
        managementService.save(manager);
        model.addAttribute("entity",manager);//传递数据
        return "manager_edit";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login()
    {
        return "manager_login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Managers manager, HttpSession session, Model model)
    {
        Managers c = managementService.login(manager.getUserName(),manager.getPassword());
        if (c!=null){
            session.setAttribute("manager",c);
            model.addAttribute("entity",c);
            return "manager_edit";
        }
        return "manager_login";
    }

}
