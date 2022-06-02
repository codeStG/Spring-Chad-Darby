package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/annotationsconfig/config/applicationContext.xml");
		
		Coach coach = context.getBean("coach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
