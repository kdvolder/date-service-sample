package com.github.kdvolder.date.ui;

import org.springframework.stereotype.Component;

@Component("fallback")
public class DateServiceHystrixCallback implements DateServiceFeignClient {

	@Override
	public String getDateString() {
		return "OFFLINE";
	}

}
