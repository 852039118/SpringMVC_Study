package com.warren.controller;

import com.warren.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    // http://localhost:8080/springmvc_04/user?id=1&name=假如我年少有为不自卑&age=344
    @RequestMapping("/user")
    public String test(User user){

        System.out.println(user.toString());
        return "test";
    }

    // http://localhost:8080/springmvc_04/user2?username=假如我年少有为不自卑
    // 规范:把@RequestParam("username")带上，这样别的参数请求就进不来
    @GetMapping("/user2")
    public String test2(@RequestParam("username") String name){

        System.out.println(name);
        return "test";
    }
}
