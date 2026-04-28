package com.app.piyush.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailConfigRunner implements CommandLineRunner {
	@Override
	@Order(10)
	public void run(String... args) throws Exception {
		System.out.println("Email Config........");

	}
}
