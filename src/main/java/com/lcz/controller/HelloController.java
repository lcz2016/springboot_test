package com.lcz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
