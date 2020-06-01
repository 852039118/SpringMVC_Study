package com.warren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/toLogin")
    public String toLoginTest(){
        return "login";
    }

    @RequestMapping("/login")
    public String loginTest(String username, String password, Model model, HttpSession session){

        // 向session记录用户身份信息
        System.out.println("接收前端==="+username);
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }
    @RequestMapping("/user/main")
        public String mainTest(){
            return "main";
    }
    @RequestMapping("/logout")
    public String logoutTest(HttpSession session){

        session.removeAttribute("userLoginInfo");

        return "login";
    }

}
