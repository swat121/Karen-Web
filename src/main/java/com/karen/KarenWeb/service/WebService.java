package com.karen.KarenWeb.service;

import com.karen.KarenWeb.model.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class WebService {
    private final RestTemplate restTemplate;

    public DataResponse getStatus() {
        DataResponse dataResponse = getResponse("karen", "/patric/status", DataResponse.class);
        return dataResponse;
    }
    public void sendRequest(String value) {
        String s;
        switch (value) {
            case "light":
                s = getResponse("karen", "patric/sensor/" + value, String.class);
            default:
                s = getResponse("karen", "patric/setting/" + value, String.class);
        }

    }
    public <T> T getResponse(String name, String url, Class<T> responseType) {
        URI karenUrl = URI.create("http://" + name).resolve(url);
        return restTemplate.getForEntity(karenUrl, responseType).getBody();
    }
}
