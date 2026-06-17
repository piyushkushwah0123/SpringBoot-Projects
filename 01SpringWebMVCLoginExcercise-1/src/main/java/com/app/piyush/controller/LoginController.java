package com.app.piyush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.piyush.entity.User;

import ch.qos.logback.core.model.Model;

public class LoginController {
	
	@GetMapping("/")
	public String logForm(Model model) {
		model.addAttribute("user",new User());
		return "Login";
	}
	
	@PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {

        if ("admin".equals(user.getUsername()) &&
            "1234".equals(user.getPassword())) {

            model.addAttribute("username", user.getUsername());
            return "success";
        }

        model.addAttribute("error", "Invalid Username or Password");
        return "login";
	

}
