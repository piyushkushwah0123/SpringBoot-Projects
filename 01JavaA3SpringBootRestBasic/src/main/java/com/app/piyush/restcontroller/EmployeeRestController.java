package com.app.piyush.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.piyush.model.Employee;

@RestController
@RequestMapping("/data")
public class EmployeeRestController {

    @GetMapping("/show-employee")
    public List<Employee> showEmployeeDetails(){
    	
    	 List<Employee> listOfEmployee = new ArrayList<>(
    	            List.of(
    	                    new Employee(1,"A","Jaipur"),
    	                    new Employee(2,"B","Udaipur"),
    	                    new Employee(3,"C","Indore")
    	            )
    	    );
        System.out.println(listOfEmployee);
        return listOfEmployee;
    }
}