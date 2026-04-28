package com.app.piyush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Ye class bhi Spring container me bean banegi
public class Test implements CommandLineRunner {

	// Spring automatically Process object inject karega (Dependency Injection)
	@Autowired
	private Process1 pob;

	@Override
	public void run(String... args) throws Exception {

		// Object me values set kar rahe hain
		pob.setCode("AAJ");
		pob.setPort(9885);

		System.out.println(pob); // toString() use ho raha hai

		System.out.println(pob.getCode());
		System.out.println(pob.getPort());
	}
}
