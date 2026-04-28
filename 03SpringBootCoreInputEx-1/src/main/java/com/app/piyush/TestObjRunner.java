package com.app.piyush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component	
public class TestObjRunner implements CommandLineRunner {
	 
	@Autowired
	private DatabaseCon con;
	
	@Override
	public void run(String... args) throws Exception {
		
		// I am Just checking the object is created or not 
		System.out.println(con);

	}
}
