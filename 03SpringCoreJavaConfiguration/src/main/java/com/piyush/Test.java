package com.piyush;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfigurationClass.class);
		
		Repository o1 = (Repository) ac.getBean("repo");
		
		System.out.println(o1);
		
	}

}
