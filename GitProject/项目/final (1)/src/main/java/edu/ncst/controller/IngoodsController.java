//package edu.ncst.controller;
//
//
//import edu.ncst.service.IngoodsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/ingoods")
//public class IngoodsController {
//
//    @Autowired
//    private IngoodsService ingoodsService;
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model) {
//        List<Ingoods> ingoodss =ingoodsService.getAllIngoods();
//        model.addAttribute("ingoodss",ingoodss);
//        return "ingoods_index";
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add1(){ return "ingoods_update";}
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String add(Ingoods g, Model model){
//        ingoodsService.add(g);
//        List<Ingoods> ingoodss = ingoodsService.getAllIngoods();
//        model.addAttribute("ingoodss",ingoodss);
//        return "ingoods_index";
//    }
//    @RequestMapping(value = "/seek", method = RequestMethod.POST)
//    public String seek(Integer id, Model model){
//        Ingoods ingoods =ingoodsService.findone(id);
//        model.addAttribute("ingoods",ingoods);
//        return "ingoods_index";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.GET)
//    public String update1(Integer id,Model model){
//        Ingoods ingoods =ingoodsService.findone(id);
//        model.addAttribute("ingoods",ingoods);
//        return "ingoods_update";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String update(Ingoods g, Model model){
//        ingoodsService.add(g);
//        List<Ingoods> ingoodss =ingoodsService.getAllIngoods();
//        model.addAttribute("ingoodss",ingoodss);
//        return "ingoods_index";
//    }
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Ingoods> list(){
//        return ingoodsService.getAllIngoods();
//    }
//
//    @RequestMapping(value = "/goods", method = RequestMethod.GET)
//    public String inGoods()
//    {
//        return "goods_index";
//    }
//
//    @RequestMapping(value = "/outgoods", method = RequestMethod.GET)
//    public String outGoods()
//    {
//        return "outgoods_index";
//    }
//
//    @RequestMapping(value = "/numgoods", method = RequestMethod.GET)
//    public String numGoods()
//    {
//        return "numgoods_index";
//    }
//}
