package com.github.kdvolder.date.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DateUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateUiApplication.class, args);
    }
}
