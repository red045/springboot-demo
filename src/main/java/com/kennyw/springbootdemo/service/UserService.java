package com.kennyw.springbootdemo.service;

import com.kennyw.springbootdemo.domain.User;
import com.kennyw.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/18 0018
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

}
