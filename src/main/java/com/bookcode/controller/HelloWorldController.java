package com.bookcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller                            //返回的默认结果为字符串
@ResponseBody
// RestController
public class HelloWorldController {
    @GetMapping("/hello")
    // @RequestMapping
    public String hello(){
        return "Hello World!";
    }
}
