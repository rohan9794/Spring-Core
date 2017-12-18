package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Bean.MyBusinessService;

@Configuration
public class BusinessConfig {

	@Bean(name="BusinessConfig")
	public MyBusinessService businessService() {
		return new MyBusinessService();
	}
	
}
