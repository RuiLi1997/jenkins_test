package com.rui.jenkins.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {

    @GetMapping("/user")
    @ResponseBody
    public String showUser(@RequestParam(name = "name", defaultValue = "default name") String name){
       if(name.equals("default name")){
           return "This is a default name";
       } else {
           return String.format("Hello, %s", name);
       }
    }

    @GetMapping("/admin")
    @ResponseBody
    public String showAdmin(@RequestParam(name = "name", defaultValue = "default name") String name){
        return "";
    }

    @GetMapping("/test-add")
    @ResponseBody
    public String testAdd(@RequestParam(name = "name", defaultValue = "default name") String name){
        System.out.println("coooooooooool");
        return "";
    }

}
