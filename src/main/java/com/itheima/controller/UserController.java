package com.itheima.controller;

import com.itheima.model.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, Model model){
        User user = userService.login(username, password);
        if (user != null){
            model.addAttribute("user",user);
            return "index";
        }else {
            return "login";
        }
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<User> userList = userService.list();
        model.addAttribute("userlist",userList);
        return "center";
    }
}
