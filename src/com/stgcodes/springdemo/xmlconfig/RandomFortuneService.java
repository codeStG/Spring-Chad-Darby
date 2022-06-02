package com.stgcodes.springdemo.xmlconfig;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private ArrayList<String> fortunes;
	private Random randomNum;
	
	public RandomFortuneService() {
		this.fortunes = new ArrayList<>();
		randomNum = new Random();
	}

	@Override
	public String getFortune() {
		fortunes.add("You will break your personal record");
		fortunes.add("Today is not looking good");
		fortunes.add("Do not give up on your goals");
		
		int index = randomNum.nextInt(fortunes.size());
		String fortune = fortunes.get(index);
		
		return fortune;
	}

}
