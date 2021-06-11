package edu.ncst.controller;

import edu.ncst.entity.Customer;
import edu.ncst.service.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model){
        List<Customer> customers = customerService.findAll();//调用业务层
        model.addAttribute("customers",customers);//传递数据
        return "customer_index";//返回网页
    }
    @RequestMapping(value = "/edit" ,method = RequestMethod.GET)
    public  String edit(Integer id,Model model)
    {
        if (id == null){
            Customer customer = new Customer();
            model.addAttribute("entity",customer);
        }
        else{
            Customer customer = customerService.findone(id);
            model.addAttribute("entity",customer);
        }
        return "customer_edit";
    }
    @RequestMapping(value = "/edit" ,method = RequestMethod.POST)
    public  String editSave(Customer customer,Model model)
    {
        customerService.save(customer);
        List<Customer> customers = customerService.findAll();//调用业务层
        model.addAttribute("customers",customers);//传递数据
        return "customer_index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer id, Model model)
    {
        customerService.delete(id);
        List<Customer> customers = customerService.findAll();//调用业务层
        model.addAttribute("customers",customers);//传递数据
        return "customer_index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Customer customer, HttpSession session)
    {
        Customer c = customerService.login(customer.getUserName(),customer.getPassword());
        if (c!=null){
            session.setAttribute("customer",c);
            return "product_index";
        }
        return "login";
    }
}
