package com.hzy.springboot.demo.controller;

import com.hzy.springboot.demo.model.User;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

// @RestController = @Controller + @ResponseBody
@RestController
//@Controller
@RequestMapping("/user")
public class MyDemoController {

    @RequestMapping("/hello")
    public String grtHello(){
        return "Hello springBoot";
    }

    @RequestMapping("/getUser")
//    @ResponseBody
    public User getUser(){
        User user = new User();
        user.setName("张三");
        user.setPassWard("12345");
        user.setAge(18);
        user.setBirthDay(new Date());
        user.setDesc(null);
        return user;
    }
}
