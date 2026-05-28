package com.app.piyush.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.piyush.bean.User;   // Import your custom User class

@Controller
public class UserController {

    @RequestMapping(value="/info", method=RequestMethod.GET)
    public String showUserPage(Map<String, Object> map) {

        System.out.println(map.getClass().getName());

        map.put("userName", "Prasoon Bidua");
        map.put("courseName", "SpringBoot And MicroServices");

        return "userHome";
    }

    // Sending One User Data
    @RequestMapping(value="/info1", method=RequestMethod.GET)
    public String showUserObject(Model model) {

        User user = new User(1, "John", "Team Leader");
        model.addAttribute("object", user);

        List<User> list = Arrays.asList(
                new User(2, "Ram", "Software Engineer"),
                new User(3, "Ramesh", "Software Engineer"),
                new User(4, "Shyam", "QA"),
                new User(5, "Ganesh", "Tester"),
                new User(6, "Naresh", "Software Engineer")
        );

        model.addAttribute("listOfObject", list);

        return "userData";
    }
}