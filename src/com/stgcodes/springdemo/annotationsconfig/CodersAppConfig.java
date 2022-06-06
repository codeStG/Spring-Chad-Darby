package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CodersAppConfig {
	
	@Bean
	public FortuneService codersFortuneService() {
		return new CodersFortuneService();
	}
	
	@Bean
	public Coach javaCoach() {
		return new JavaCoach(codersFortuneService());
	}

}
