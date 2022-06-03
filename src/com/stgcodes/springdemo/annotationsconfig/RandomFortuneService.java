package com.stgcodes.springdemo.annotationsconfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>(Arrays.asList("You will break your personal record",
			"Today is not looking good", "Do not give up on your goals"));
	private Random randomNum;

	public RandomFortuneService() {
		randomNum = new Random();
	}

	@Override
	public String getFortune() {
		int index = randomNum.nextInt(fortunes.size());
		String fortune = fortunes.get(index);

		return fortune;
	}

}
