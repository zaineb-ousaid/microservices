package com.example.odiscovryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ODiscovryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ODiscovryServiceApplication.class, args);
    }

}
