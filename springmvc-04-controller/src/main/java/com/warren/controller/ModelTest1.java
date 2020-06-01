package com.warren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public void test1(HttpServletRequest req , HttpServletResponse resp){
        HttpSession session = req.getSession(); // 可以直接定义HttpServletRequest使用
        System.out.println(session);
    }

    @RequestMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg","ModelTest2");
        // 转发(地址未变)
//        return "test";
        return "forward:/WEB-INF/jsp/test.jsp"; // 未加视图解析器
    }

    @RequestMapping("/m1/t3")
    public String test3(Model model){
        model.addAttribute("msg","ModelTest3");
        // 重定向(地址改变)
//        return "redirect:/test.jsp";
        return "redirect:/WEB-INF/jsp/test.jsp"; // 未加视图解析器
    }
}
