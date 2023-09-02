package com.techgeek.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Spring boot!!";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring boot world!";
    }
}
