package com.piyush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationClass {
	@Bean
	public Repository repo() {
		Repository  r1 = new Repository ();
		r1.setPathTotStore(12);
		r1.setR("Hello");
		return r1;
	}
	

}
