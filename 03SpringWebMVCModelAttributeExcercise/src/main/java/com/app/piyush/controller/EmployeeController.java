package com.app.piyush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.piyush.bean.Employee;

@Controller
public class EmployeeController {

	// 1. To display html From the browser
	
	// Path : show Http Method : Get
	@GetMapping("/show")
	public String showForm() {
		return "EmployeeRegister";
	}
	
	// 2. To read data from html from (ModelAttribute)
	@PostMapping("/register")
	public String readData(@ModelAttribute Employee employee , Model model) {
		System.out.println(employee);
		model.addAttribute("obj",employee);
		return "EmpData";
	}
	
}
