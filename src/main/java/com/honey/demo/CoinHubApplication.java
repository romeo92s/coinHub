package com.honey.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CoinHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinHubApplication.class, args);
	}

}
