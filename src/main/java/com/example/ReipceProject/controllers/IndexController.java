package com.example.ReipceProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"","/","/index"})
    public String getIndexpAge(){

        System.out.println("some message to say...1234");
        return "index";
    }
}
