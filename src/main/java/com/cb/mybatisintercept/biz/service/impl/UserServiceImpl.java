package com.cb.mybatisintercept.biz.service.impl;

import com.cb.mybatisintercept.biz.mapper.UserMapper;
import com.cb.mybatisintercept.biz.pojo.User;
import com.cb.mybatisintercept.biz.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getList() {
        return userMapper.getList();
    }
}
