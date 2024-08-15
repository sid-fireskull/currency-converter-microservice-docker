package com.microservices.api.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder
				.routes()
				.route(r -> r.path("/currency-conversion/**")
						.uri("lb://currency-conversion"))
				.route(r -> r.path("/currency-exchange/**")
						.uri("lb://currency-exchange"))
				.route(r -> r.path("/currency/**")
						.filters(p -> p.rewritePath(
								"/currency/(?<segment>.*)",
								"/currency-conversion/${segment}"))
						.uri("lb://currency-conversion"))
				.build();
	}
}
