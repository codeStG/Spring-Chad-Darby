package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

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
