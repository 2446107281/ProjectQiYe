package edu.ncst.controller;


import edu.ncst.entity.Outgoods;
import edu.ncst.service.OutgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/outgoods")
public class OutgoodsController {

    @Autowired
    private OutgoodsService outgoodsService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        List<Outgoods> outgoodss =outgoodsService.getAllOutgoods();
        model.addAttribute("outgoodss",outgoodss);
        return "outgoods_index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add1(){ return "outgoods_update";}

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Outgoods g, Model model){
        outgoodsService.add(g);
        List<Outgoods> outgoodss = outgoodsService.getAllOutgoods();
        model.addAttribute("outgoodss",outgoodss);
        return "outgoods_index";
    }
    @RequestMapping(value = "/seek", method = RequestMethod.POST)
    public String seek(Integer id, Model model){
        Outgoods outgoods =outgoodsService.findone(id);
        model.addAttribute("outgoods",outgoods);
        return "outgoods_index";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update1(Integer id,Model model){
        Outgoods outgoods =outgoodsService.findone(id);
        model.addAttribute("outgoods",outgoods);
        return "outgoods_update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Outgoods g, Model model){
        outgoodsService.add(g);
        List<Outgoods> outgoodss =outgoodsService.getAllOutgoods();
        model.addAttribute("outgoodss",outgoodss);
        return "outgoods_index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Outgoods> list(){
        return outgoodsService.getAllOutgoods();
    }

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String inGoods()
    {
        return "goods_index";
    }

    @RequestMapping(value = "/ingoods", method = RequestMethod.GET)
    public String outGoods()
    {
        return "ingoods_index";
    }

    @RequestMapping(value = "/numgoods", method = RequestMethod.GET)
    public String numGoods()
    {
        return "numgoods_index";
    }
}
