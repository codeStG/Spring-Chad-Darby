package com.stgcodes.springdemo.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/xmlconfig/config/beanLifeCycle-applicationContext.xml");
		
		//retrieve Bean from Spring Container
		Coach coach = context.getBean("coach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());

		//close the context
		context.close();
	}

}
