package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/annotationsconfig/config/applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach gymnasticsCoach = context.getBean("gymnasticsCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(gymnasticsCoach.getDailyWorkout());
		
		context.close();
	}

}
