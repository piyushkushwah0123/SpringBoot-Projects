package com.app.prasoon.repo;

import java.util.List;

import com.app.prasoon.entity.Employee;

public interface EmployeeRepository {

	void saveAll(List<Employee> asList);

	Iterable<Employee> findAll();

}
