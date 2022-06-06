package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.stgcodes.springdemo.annotationsconfig")
@PropertySource("classpath:com/stgcodes/springdemo/annotationsconfig/config/sport.properties")
public class AppConfig {
	
}
