package com.stgcodes.springdemo.annotationsconfig;

public class CodersFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Its a bit too chilly to grab a byte";
	}

}
