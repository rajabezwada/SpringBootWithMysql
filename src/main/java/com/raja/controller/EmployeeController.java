package com.raja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raja.model.Employee;
import com.raja.repository.EmployeeDAO;

@RestController
@RequestMapping(value="/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping(value="/getEmployeeData")
	public Iterable<Employee> getEmployeeData() {
	Iterable<Employee> employeeData = 	employeeDAO.findAll();
		return employeeData;
	}

}
