package com.goozoo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcloudHelloworldsApplication {
    //实现路由功能
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(t -> t.path("/hello")
                        .and()
                        .uri("http://localhost:8080"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHelloworldsApplication.class, args);
    }

}

