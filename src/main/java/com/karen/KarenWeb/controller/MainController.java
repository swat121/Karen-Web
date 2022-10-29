package com.karen.KarenWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMain(){
        return "main";
    }
//    @PostMapping("/")
//    public String getButtonClick(Model model, @RequestParam(value = "action") String name){
//        System.out.println(name + "              -----------------------------------------------");
//        return "main";
//    }
    @RequestMapping("/")
    public String index(Model model, @RequestParam(value = "action") String name){
        System.out.println(name + "              -----------------------------------------------");
        return "main";
    }
}
