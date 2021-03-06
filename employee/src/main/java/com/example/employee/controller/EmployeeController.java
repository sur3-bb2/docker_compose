package com.example.employee.controller;

import java.util.List;

import com.example.employee.model.Employee;
import com.example.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee){
		
		Employee result = employeeRepository.save(employee);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
	public Employee get(@PathVariable String employeeId){
		return employeeRepository.findById(employeeId).orElse(null);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
}
