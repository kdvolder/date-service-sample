package com.github.kdvolder.date.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DateUIController {

	//This isn't a real 'ui'. Just a very dumb controller that returns a message which includes a
	// date string fetched from 'date-service'
	
	@Autowired
	private RestTemplate rest;
	
	@RequestMapping("/")
	public String hello() {
		return "The dateservice says: "+rest.getForObject("http://date-service/", String.class);
	}
	
}
