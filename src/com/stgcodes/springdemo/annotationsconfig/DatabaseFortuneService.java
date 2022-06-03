package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return null;
	}

}
