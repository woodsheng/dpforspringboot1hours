package com.bookcode.controller;

import com.bookcode.dao.UserRepository;
import com.bookcode.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GetusersController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/list")
    public String listUser(Model model){  //这个地方用model来存储数据，里面存储键值对，值可以为list
        List<User> userList = new ArrayList<User>();
        userList = userRepository.findAll();
        model.addAttribute("users",userList);
        return "list";
    }
}
