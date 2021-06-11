package edu.ncst.controller;


import edu.ncst.entity.Numgoods;
import edu.ncst.service.NumgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/numgoods")
public class NumgoodsController {

    @Autowired
    private NumgoodsService numgoodsService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        List<Numgoods> numgoodss =numgoodsService.getAllNumgoods();
        model.addAttribute("numgoodss",numgoodss);
        return "numgoods_index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add1(){ return "numgoods_update";}

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Numgoods g, Model model){
        numgoodsService.add(g);
        List<Numgoods> numgoodss = numgoodsService.getAllNumgoods();
        model.addAttribute("numgoodss",numgoodss);
        return "numgoods_index";
    }
    @RequestMapping(value = "/seek", method = RequestMethod.POST)
    public String seek(Integer id, Model model){
        Numgoods numgoods =numgoodsService.findone(id);
        model.addAttribute("numgoods",numgoods);
        return "numgoods_index";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update1(Integer id,Model model){
        Numgoods numgoods =numgoodsService.findone(id);
        model.addAttribute("numgoods",numgoods);
        return "numgoods_update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Numgoods g, Model model){
        numgoodsService.add(g);
        List<Numgoods> numgoodss =numgoodsService.getAllNumgoods();
        model.addAttribute("numgoodss",numgoodss);
        return "numgoods_index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Numgoods> list(){
        return numgoodsService.getAllNumgoods();
    }

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String inGoods()
    {
        return "goods_index";
    }

    @RequestMapping(value = "/outgoods", method = RequestMethod.GET)
    public String outGoods()
    {
        return "outgoods_index";
    }

    @RequestMapping(value = "/ingoods", method = RequestMethod.GET)
    public String numGoods()
    {
        return "ingoods_index";
    }
}
