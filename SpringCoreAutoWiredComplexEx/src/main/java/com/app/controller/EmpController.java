package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpController {
	
	IEmpService sob;

    public void getInfo() {
        System.out.println("Controller");
    }
}