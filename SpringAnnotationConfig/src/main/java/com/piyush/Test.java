package com.piyush;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		// scan method -> takes input as package var-arg (jdk 1.5)
		// multiple packages you can take with comma separately
		// find all classes from given package and its sub-package.
		// it will scan all classes from this package and I have to tell refresh
		// when I call refresh method it will call all the required object
		// it will update the container

		ac.scan("com.piyush");
		ac.refresh();           // refresh Spring Container
		// Everything setup from the beginning
		// getbean methods returns Object type
		HandlerInfo ob = (HandlerInfo)ac.getBean("hob",HandlerInfo.class);
		
		System.out.println(ob);
	}

}
