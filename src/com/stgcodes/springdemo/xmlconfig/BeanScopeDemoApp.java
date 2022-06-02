package com.stgcodes.springdemo.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/stgcodes/springdemo/xmlconfig/config/beanScope-applicationContext.xml");
		
		//retrieve Bean from Spring Container
		Coach coach = context.getBean("coach", Coach.class);
		
		Coach coachTwo = context.getBean("coach", Coach.class);
		
		//check if they are the same
		boolean result = (coach == coachTwo);
		
		//print out result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for coach: " + coach);
		System.out.println("\nMemory location for coachTwo: " + coachTwo + "\n");

		//close the context
		context.close();
	}

}
