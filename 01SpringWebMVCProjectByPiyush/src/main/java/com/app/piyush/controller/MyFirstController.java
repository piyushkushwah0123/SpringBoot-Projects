package com.app.piyush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

//	@RequestMapping("/myapplication")
//	@RequestMapping(value="/myapplication",method=RequestMethod.Get)
	@GetMapping("/myapplication")
	public ModelAndView displayMyResponse() {
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","We are Learning Spriing Boot from CodeX Prasoon Channel");
		mav.setViewName("data");
		
		return mav;
	}
}
