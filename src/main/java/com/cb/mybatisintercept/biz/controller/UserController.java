package com.cb.mybatisintercept.biz.controller;


import com.alibaba.fastjson.JSON;
import com.cb.mybatisintercept.biz.pojo.User;
import com.cb.mybatisintercept.biz.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public String getUserList() {
        List<User> users = userService.getList();
        return JSON.toJSONString(users);
    }
}
