package com.bookcode.controller;

import com.bookcode.dao.UserRepository;
import com.bookcode.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller                               // 控制器
@RequestMapping(path="/demo")  //UserController类中地址是相对地址，在/demo后添加
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path="/add")             // 相对地址，相当于/demo/add
    @ResponseBody         // @ResponseBody表明返回是字符串而不是视图名
    public  String addNewUser (@RequestParam String firstname , @RequestParam String lastname) {
        // @RequestParam表示传入到User构造器中的参数
        User user = new User(firstname,lastname);
        userRepository.save(user);
        return "Saved";
    }
    @GetMapping(path="/finduser/{lastname}") //根据lastname查找返回user信息
    @ResponseBody
//@PathVariable表示参数lastname
    public  String finduser (@PathVariable("lastname")  String lastname){
        List<User> userList = userRepository.findByLastName(lastname);
        String users ="  ";
        for(User user:userList) {users += user.toString() + "      ";};
        return users;
    }
}
