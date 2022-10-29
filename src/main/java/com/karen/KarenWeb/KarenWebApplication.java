package com.karen.KarenWeb;

import com.karen.KarenWeb.config.UrlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(UrlConfig.class)
public class KarenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarenWebApplication.class, args);
	}

}
