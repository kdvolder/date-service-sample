package com.github.kdvolder.date.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateServiceApplication.class, args);
    }
}
