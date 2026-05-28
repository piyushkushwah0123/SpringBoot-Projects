package com.app.prasoon.runner;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.app.prasoon.entity.Employee;
import com.app.prasoon.repo.EmployeeRepository;

public class TestOperationsRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Employee e1 = new Employee(10, "E1", 100.00);
		Employee e2 = new Employee(11, "E2", 200.00);
		Employee e3 = new Employee(12, "E3", 300.00);

		repo.saveAll(Arrays.asList(e1,e2,e3));

		Iterable<Employee> data = repo.findAll();
		
		System.out.println("______________________");

	}

}
