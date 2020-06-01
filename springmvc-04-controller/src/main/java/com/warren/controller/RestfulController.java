package com.warren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestfulController {

    @GetMapping("/add/{p1}/{p2}")
    public String test1(@PathVariable int p1 ,@PathVariable int p2 , Model model){
        int temp = p1 + p2;
        model.addAttribute("msg", "结果为：" + temp);
        return "test";
    }

    @PostMapping("/add/{p1}/{p2}")
    public String test2(@PathVariable int p1 ,@PathVariable int p2 , Model model){
        int temp = p1 + p2;
        model.addAttribute("msg", "结果为：" + temp);
        return "test";

    }
}
