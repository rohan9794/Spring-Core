package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Bean.MyJdbcService;

@Configuration
public class MyConfig {

	@Bean(name="MyConfig")
	public MyJdbcService JDBCService() {
	    return new MyJdbcService();
	}
	
}
