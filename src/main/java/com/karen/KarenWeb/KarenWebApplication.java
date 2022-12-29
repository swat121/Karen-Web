package com.karen.KarenWeb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KarenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarenWebApplication.class, args);
	}

}
