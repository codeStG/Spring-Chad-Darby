package com.stgcodes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the Bean from the Spring Container
		BasketballCoach coach = context.getBean("basketballCoach", BasketballCoach.class);
		
		//call methods on the Bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getTeam());
		
		//close the context
		context.close();
	}

}
