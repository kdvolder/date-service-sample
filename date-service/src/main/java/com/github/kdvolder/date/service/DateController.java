package com.github.kdvolder.date.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@RequestMapping("/")
	public String main() {
		//foofofof
		System.out.println("fooooo");
		return new Date().toString();
	}

	@RequestMapping("/date")
	public String date() {
		//foofofof
		System.out.println("fooooo");
		return new Date().toString();
	}

}
