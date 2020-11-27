package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/user/findAll")
    public Result findAll(){
        List<User> list = userService.findAll();
        return Result.ok(list);
    }

}
