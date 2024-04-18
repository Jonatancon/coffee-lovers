package com.coffee.lovers.gatway.beans;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayBeans {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(route -> route
                        .path("/coffee-shop-api/**")
                        .uri("lb://coffee-shop"))
                .route(route -> route
                        .path("/employed-api/**")
                        .uri("lb://employed"))
                .route(route -> route
                        .path("/user-api/**")
                        .uri("lb://usuarios"))
                .build();
    }
}
