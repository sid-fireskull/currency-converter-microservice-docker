package com.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CurrencyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConfigServerApplication.class, args);
		System.out.println("[+] Config Server Started up...");
	}

}
