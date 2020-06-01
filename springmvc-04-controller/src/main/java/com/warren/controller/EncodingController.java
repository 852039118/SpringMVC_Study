package com.warren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class EncodingController {
    @GetMapping("/e/t")
    public String testCaoNiMa(Model model){
        String name = "caoniama ";
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

    @RequestMapping("e/t2")   //为什么用/e/t2就报404，用e/t2就可以
    public String test2(String name, Model model, HttpServletRequest req) throws UnsupportedEncodingException {

        req.setCharacterEncoding("UTF-8");  //无法解决乱码，应使用过滤器解决

        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

}
