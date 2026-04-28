package com.app.piyush.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner{
	@Override
	@Order(15)
	public void run(String... args) throws Exception {
		System.out.println("Message Runner........");
		
	}

}
