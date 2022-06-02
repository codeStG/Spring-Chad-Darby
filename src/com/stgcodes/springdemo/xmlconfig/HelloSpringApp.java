package com.stgcodes.springdemo.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/xmlconfig/config/applicationContext.xml");
		
		//retrieve Bean from Spring Container
		Coach coach = context.getBean("coach", Coach.class);
		
		//call methods on the Bean
		System.out.println(coach.getDailyWorkout());
		
		//call method for fortunes
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
