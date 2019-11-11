package org.libo.controller;

import org.libo.entity.User;
import org.libo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testboot")
public class userController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("getUser/{id}")
    @ResponseBody
    public String GetUser(@PathVariable int id){
        return userServiceImpl.seeUser(id).toString();
    }
    @RequestMapping("add")
    @ResponseBody
    public String addUser(User user){
        int a = userServiceImpl.addUser(user);
        System.out.println(user.toString());
        return "index";
    }
}
