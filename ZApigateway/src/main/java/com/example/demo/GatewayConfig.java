package com.example.demo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GatewayConfig {
	@Bean
    public RouteLocator customRoute(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("ZProductService", r -> r.path("/product/**")
                .uri("http://localhost:9977"))
            .route("ZOrderService", r -> r.path("/order/**")
                .uri("http://localhost:7788"))
            .build();
    }
}
