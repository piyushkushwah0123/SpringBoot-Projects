package com.app.piyush.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
	
	private Integer empId;
	private String empName;
	private String empCity;

}
