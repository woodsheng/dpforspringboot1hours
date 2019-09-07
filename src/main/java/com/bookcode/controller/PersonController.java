package com.bookcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person")
    public Person getUserInfo(){
        Person person= new Person("guest","123456");
        return person;
    }
}
