//package edu.ncst.controller;
//
//import edu.ncst.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
//@Controller
//@RequestMapping("/order")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//    @RequestMapping(value = "/submit",method = RequestMethod.GET)
//    public String submit(HttpSession session){
//        List<Order>orders = ( List<Order>)session.getAttribute("orders");
//        for (Order o :orders ){
//            orderService.save(o);
//        }
//        orders.clear();
//        return "pay";
//    }
//}
