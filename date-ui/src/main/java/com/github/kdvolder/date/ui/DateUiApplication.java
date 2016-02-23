package com.github.kdvolder.date.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class DateUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateUiApplication.class, args);
    }
}
