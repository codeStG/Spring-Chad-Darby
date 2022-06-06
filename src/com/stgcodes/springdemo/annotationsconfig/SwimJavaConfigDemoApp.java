package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Coach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		context.close();
	}

}
