package com.app.piyush;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProcessImpl implements IProcess {
	
	@Override
	public void getprocesscode() {
		System.out.println("P1");
	}

}
