package com.karen.KarenWeb.controller;

import com.karen.KarenWeb.service.WebService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {

    public WebService webService;

    @GetMapping("/ping")
    public String getPing(Model model) {
        String ping = webService.getResponse("karen", "ping", String.class);
        model.addAttribute("ping", ping);
        return ping;
    }
}
