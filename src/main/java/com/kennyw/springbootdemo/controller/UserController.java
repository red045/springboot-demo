package com.kennyw.springbootdemo.controller;

import com.kennyw.springbootdemo.domain.User;
import com.kennyw.springbootdemo.service.UserService;
import com.kennyw.springbootdemo.util.SpringBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/3/4 0004
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Integer id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
