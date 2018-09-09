package com.hxjc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 21892 on 2018/9/9.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","springboot 集成 Thymeleaf");
        return "index";
    }
}
