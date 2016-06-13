package com.github.kdvolder.date.ui;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="date-service", fallback=DateServiceHystrixCallback.class)
@Component
public interface DateServiceFeignClient {

	@RequestMapping(method=RequestMethod.GET, value="/")
	String getDateString();
	
}
