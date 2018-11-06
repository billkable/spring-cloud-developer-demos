package io.pivotal.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class GatewayApplication {
    private Set<String> emailWhitelist;

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r ->
//                        r
//                            .header("api-version", "V1.2.8")
//                            .uri("http://localhost:8081")
//
//                )
//                .route(r ->
//                        r
//                            .header("api-version", "V2.0.0")
//                            .uri("http://localhost:8082")
//                )
//                .build();
//
//    }
}
