package com.sheldon.real.time.communication.controller;


import com.sheldon.real.time.communication.entity.User;
import com.sheldon.real.time.communication.service.UserImpl.UserServiceImpl;
import com.sheldon.real.time.communication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String testController() {
//        UserServiceImpl userService = new UserServiceImpl();
//        List<User> allUser1 = userService.getAllUser();
        List<User> allUser = this.userService.getAllUser();
        return allUser.toString();
    }
}
