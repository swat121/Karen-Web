package com.karen.KarenWeb.controller;

import com.karen.KarenWeb.model.DataResponse;
import com.karen.KarenWeb.service.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@AllArgsConstructor
public class MainController {
    public WebService webService;
    @GetMapping("/main/control-panel")
    public String getMain(Model model){
        DataResponse dataResponse = webService.getStatus();
        model.addAttribute("data", dataResponse);
        return "control-panel";
    }
    @PostMapping("/main/control-panel")
    public String getButtonClick(Model model, @RequestParam(value = "action") String value){
        webService.sendRequest(value);
        DataResponse dataResponse = webService.getStatus();
        model.addAttribute("data", dataResponse);
        return "control-panel";
    }

    @GetMapping("/main")
    public String getMainPage() {
        return "main";
    }
}
