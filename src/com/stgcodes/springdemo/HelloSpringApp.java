package com.stgcodes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve Bean from Spring Container
		Coach coach = context.getBean("coach", Coach.class);
		
		//call methods on the Bean
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
