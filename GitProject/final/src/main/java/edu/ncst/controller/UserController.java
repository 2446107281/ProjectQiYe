package edu.ncst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/10/26 0026.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
}
