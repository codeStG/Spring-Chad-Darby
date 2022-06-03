package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/annotationsconfig/config/applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		GymnasticsCoach gymnasticsCoach = context.getBean("gymnasticsCoach", GymnasticsCoach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(gymnasticsCoach.getDailyWorkout());
		System.out.println(gymnasticsCoach.getDailyFortune());
		System.out.println(gymnasticsCoach.getEmail());
		System.out.println(gymnasticsCoach.getTeam());
		
		context.close();
	}

}
