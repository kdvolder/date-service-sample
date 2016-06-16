package com.github.kdvolder.date.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	
	private static final Logger log = LoggerFactory.getLogger(DateController.class);
	
	@RequestMapping("/")
	public String main() {
		log.info("Fetching date...");
		return new Date().toString();
	}

	@RequestMapping("/date")
	public String date() {
		return new Date().toString();
	}

}
