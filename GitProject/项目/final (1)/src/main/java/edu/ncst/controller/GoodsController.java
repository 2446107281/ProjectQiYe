//package edu.ncst.controller;
//
//
//import edu.ncst.service.GoodsService;
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
//@RequestMapping("/goods")
//public class GoodsController {
//
//    @Autowired
//    private GoodsService goodsService;
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model) {
//        List<Goods> goodss =goodsService.getAllGoods();
//        model.addAttribute("goodss",goodss);
//        return "goods_index";
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add1(){ return "goods_update";}
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String add(Goods g, Model model){
//        goodsService.add(g);
//        List<Goods> goodss = goodsService.getAllGoods();
//        model.addAttribute("goodss",goodss);
//        return "goods_index";
//    }
//    @RequestMapping(value = "/seek", method = RequestMethod.POST)
//    public String seek(Integer id, Model model){
//        Goods goods =goodsService.findone(id);
//        model.addAttribute("goods",goods);
//        return "goods_index";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.GET)
//    public String update1(Integer id,Model model){
//        Goods goods =goodsService.findone(id);
//        model.addAttribute("goods",goods);
//        return "goods_update";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String update(Goods g, Model model){
//        goodsService.add(g);
//        List<Goods> goodss = goodsService.getAllGoods();
//        model.addAttribute("goodss",goodss);
//        return "goods_index";
//    }
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Goods> list(){
//        return goodsService.getAllGoods();
//    }
//
//    @RequestMapping(value = "/ingoods", method = RequestMethod.GET)
//    public String inGoods()
//    {
//        return "ingoods_index";
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
