package com.dong.ssm.controller;

import com.dong.ssm.model.User;
import com.dong.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
