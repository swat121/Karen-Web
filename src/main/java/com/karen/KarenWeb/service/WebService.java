package com.karen.KarenWeb.service;

import com.karen.KarenWeb.config.UrlConfig;
import com.karen.KarenWeb.model.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WebService {
    private final RestTemplate restTemplate;
    private final UrlConfig urlConfig;

    public DataResponse getStatus() {
        DataResponse dataResponse = restTemplate.getForEntity(urlConfig.getResource().get("Patric") + "/status", DataResponse.class).getBody();
        return dataResponse;
    }
    public void sendRequest(String value){
        String s;
        switch (value){
            case "light":
                s = restTemplate.getForEntity(urlConfig.getResource().get("Patric") + "/sensor/" + value, String.class).getBody();
            default:
                s = restTemplate.getForEntity(urlConfig.getResource().get("Patric") + "/setting/" + value, String.class).getBody();
        }

    }
}
