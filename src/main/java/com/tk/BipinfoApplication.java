package com.tk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BipinfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(BipinfoApplication.class, args);
	}
}
