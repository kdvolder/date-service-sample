package com.github.kdvolder.date.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import feign.Logger;
import feign.Logger.Level;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class DateUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateUiApplication.class, args);
    }
    
    @Bean
    Logger.Level feignLoggerLevel() {
    	//Sets the level of detail Feign client logs.
    	//Note that for this to take effect you must also set the logger.level.<ClientName>=debug in application.yml
    	return Level.BASIC;
    }
}
