package Runner_person.controller;

import Runner_person.entity.Publisher;
import Runner_person.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.List;

//controller三个功能 接受用户的输入，调用业务层完成相应的功能,返回页面相应数据
@Controller
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;
    //注入PublisherService

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Publisher> publishers = publisherService.findAll();//调用业务层
        model.addAttribute("publishers",publishers);//传递数据
        return "publisher_index";//返回网页
    }

    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit(Integer id,Model model)
    {
        if (id == null){
            Publisher publisher = new Publisher();
            model.addAttribute("entity",publisher);
        }
        else{
            Publisher publisher = publisherService.findone(id);
            model.addAttribute("entity",publisher);
        }
        return "publisher_edit";
    }
    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Publisher publisher,Model model)
    {
        publisherService.save(publisher);
        List<Publisher> publishers = publisherService.findAll();//调用业务层
        model.addAttribute("publishers",publishers);//传递数据
        return "publisher_index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Publisher publisher, HttpSession session)
    {
        Publisher c = publisherService.login(publisher.getUseraccount(),publisher.getPassword());
        if (c!=null){
            session.setAttribute("publisher",c);
            return "product_index";
        }
        return "login";
    }
}
