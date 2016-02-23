package com.github.kdvolder.date.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class DateServiceClient {

	@Autowired
	private RestTemplate rest;
	
	@HystrixCommand(fallbackMethod="fallbackDateString")
	public String getDateString() {
		return rest.getForObject("http://date-service/", String.class);
	}

	public String fallbackDateString() {
		return "OFFLINE";
	}
}
