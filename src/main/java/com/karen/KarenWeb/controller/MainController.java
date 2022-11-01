package com.karen.KarenWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMain(Model model){
        model.addAttribute("name", "main Light");
        return "main";
    }
    @PostMapping("/")
    public String getButtonClick(Model model, @RequestParam(value = "action") String name){
        return "main";
    }
}
