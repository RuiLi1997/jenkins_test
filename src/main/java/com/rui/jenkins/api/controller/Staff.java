package com.rui.jenkins.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Staff {
    @GetMapping("/staff")
    @ResponseBody
    public String showUser(@RequestParam(name = "name", defaultValue = "default name") String name){
        if(name.equals("default name")){
            return "This is a default staff";
        } else {
            return String.format("Hello staff, %s", name);
        }
    }

    @GetMapping("/staff1")
    @ResponseBody
    public String showAdmin(@RequestParam(name = "name", defaultValue = "default name") String name){
        return "staff1";
    }
}
