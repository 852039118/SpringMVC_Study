package com.warren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo02 {

    @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","ControllerDemo02-test");
        return "test";
    }

    @RequestMapping("/t22")
    public String test2(Model model){
        model.addAttribute("msg","ControllerDemo02-test2");
        return "test";
    }
}
