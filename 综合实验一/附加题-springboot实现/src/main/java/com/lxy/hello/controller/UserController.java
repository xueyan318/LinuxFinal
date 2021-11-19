package com.lxy.hello.controller;

import com.lxy.hello.pojo.UserDO;
import com.lxy.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/helloJosnUserInfo")
    public List<UserDO> findUser(){
        return userService.findUser();
    }

    @GetMapping("/findById")
    public List<UserDO> findUser(@RequestParam("id") Integer id){
        return userService.findById(id);
    }

}
