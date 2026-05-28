package com.app.piyush;

import org.springframework.stereotype.Component;

@Component
public class AdvProcessImpl implements IProcess {
	
	@Override
	public void getprocesscode() {
		System.out.println("P2");
	}
	

}
