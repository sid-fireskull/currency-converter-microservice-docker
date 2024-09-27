package com.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/currency-exchange")
public class CircuitBreakerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/demo")
//	@Retry(name="demo-api",fallbackMethod = "fallbackResponse" )
	@CircuitBreaker(name="demo-api",fallbackMethod = "fallbackResponse" )
	@RateLimiter(name="demo-api", fallbackMethod = "fallbackResponse")
	public String circuitDemo()
	{
		logger.info("[info] CircuitDemo is Called!!!");
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:4444/fail-api", String.class);
		return response.getBody();
	}
	
	public String fallbackResponse(Exception ex)
	{
		return "Fallback Response!!";
	}
}
