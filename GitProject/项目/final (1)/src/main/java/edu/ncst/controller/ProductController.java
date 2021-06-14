//package edu.ncst.controller;
//
//
//import edu.ncst.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpSession;
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/product")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model) {
//        List<Product> products = productService.getAllProduct();
//        model.addAttribute("products",products);
//        return "product_index";
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String add(Product p, Model model){
//        productService.add(p);
//        List<Product> products = productService.getAllProduct();
//        model.addAttribute("products",products);
//        return "product_index";
//    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.POST)
//    @ResponseBody
//    public String delete(Integer productId){
//        try{
//            productService.delete(productId);
//            return "success!";
//        }catch (Exception e){
//            return "error!";
//        }
//    }
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Product> list(){
//        return productService.getAllProduct();
//    }
//    @RequestMapping(value = "/order", method = RequestMethod.POST)
//    @ResponseBody//返回值是一个网页或一个网页的名字才不用该注解
//    public String order(Integer id, HttpSession session){
//        try{
//            Boolean orderhaving = false;
//            Product product = productService.findone(id);
//            Order order =new Order();
//            order.setProduct(product);
//            order.setPrice(product.getPrice());
//            order.setCount(1);
//            order.setCustomer((Customer) session.getAttribute("customer"));
//            List<Order> orders ;
//            if (session.getAttribute("orders")==null)
//            {
//                orders = new ArrayList<Order>();
//                orders.add(order);
//                session.setAttribute("orders",orders);
//            }
//            else{
//                //需要取出List<Order>类型的数据但getAttribute取出的是object类型故用强制类型转换
//                orders = (List<Order>) session.getAttribute("orders");
//                for (Integer i = 0 ; i<orders.size();i++)
//                {
//                    if (order.getProduct().getId()==orders.get(i).getProduct().getId())
//                    {
//                        orders.get(i).setCount(orders.get(i).getCount()+1);
//                        orderhaving = true;
//                    }
//                }
//                if (orderhaving){}
//                else{orders.add(order);}
//            }
//            return "ok";
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }
//
//    @RequestMapping(value = "/shopcart", method = RequestMethod.GET)
//    public String shopCart()
//    {
//        return "shopcart_index";
//    }
//
//    @RequestMapping(value = "/shopcart_list", method = RequestMethod.POST)
//    @ResponseBody//返回值是一个网页或一个网页的名字才不用该注解
//    public List<Order> shopCartList(HttpSession session ){
//        return (List<Order>)session.getAttribute("orders");
//    }
//}
