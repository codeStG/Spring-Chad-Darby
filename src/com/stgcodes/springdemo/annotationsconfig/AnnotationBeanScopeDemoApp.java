package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/annotationsconfig/config/applicationContext.xml"); 
		
		//retrieve bean from spring container
		//Tennis coach @Scope must be set for this to work properly
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach coachTwo = context.getBean("tennisCoach", Coach.class);
		
		
		//check if they are the same object
		boolean result = (coach == coachTwo);
		
		//print out the result
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for coach: " + coach);
		
		System.out.println("\nMemory location for coachTwo: " + coachTwo);
		
		//close the context
		context.close();
	}

}
