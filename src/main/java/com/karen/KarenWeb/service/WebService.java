package com.karen.KarenWeb.service;

import com.karen.KarenWeb.model.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WebService {
    private final RestTemplate restTemplate;

    public DataResponse getStatus() {
        DataResponse dataResponse = restTemplate.getForEntity("http://192.168.0.102:8080/" + "patric/status", DataResponse.class).getBody();
        return dataResponse;
    }
    public void sendRequest(String value){
        DataResponse dataResponse;
        switch (value){
            case "light":
                dataResponse = restTemplate.getForEntity("http://192.168.0.102:8080/" + "patric/sensor/" + value, DataResponse.class).getBody();
            default:
                dataResponse = restTemplate.getForEntity("http://192.168.0.102:8080/" + "patric/setting/" + value, DataResponse.class).getBody();
        }

    }
}
