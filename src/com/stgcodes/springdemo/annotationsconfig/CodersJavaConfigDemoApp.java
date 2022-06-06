package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CodersJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CodersAppConfig.class);
		
		Coach javaCoach = context.getBean("javaCoach", Coach.class);
		
		System.out.println(javaCoach.getDailyWorkout());
		System.out.println(javaCoach.getDailyFortune());
		
		context.close();
	}

}
