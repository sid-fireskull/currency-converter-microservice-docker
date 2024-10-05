package com.microservices.namingserver.Currency_Naming_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyNamingServerApplication.class, args);
		System.out.println("[+] Naming Server started up...");
	}

}
