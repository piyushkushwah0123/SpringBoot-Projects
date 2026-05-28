package com.app.piyush.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

		Driver d1 = (Driver) ac.getBean("driver");

		System.out.println(d1);

	}

}
