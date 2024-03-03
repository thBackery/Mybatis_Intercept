package com.cb.mybatisintercept.biz.service;

import com.cb.mybatisintercept.biz.pojo.User;
import jakarta.annotation.Resource;

import java.util.List;

public interface UserService {

    List<User> getList();

}
