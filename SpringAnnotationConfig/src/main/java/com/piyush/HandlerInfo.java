package com.piyush;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("hob")
public class HandlerInfo {
	
	@Value("data")
	private String resolverCode;
	
	@Value("temp")
	private String pathToStore;
	
	public HandlerInfo() {
		super();
	}
	// to see the  Data
	
	@Override
	public String toString() {
	    return "HandlerInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}

}
