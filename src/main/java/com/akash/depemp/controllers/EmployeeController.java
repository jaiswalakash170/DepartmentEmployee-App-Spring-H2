package com.akash.depemp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.depemp.dao.EmployeeRepo;
import com.akash.depemp.models.Employee;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

	@Autowired
	EmployeeRepo empRepo;
	
	@GetMapping("/show")
	public List<Employee> showDepartments()
	{
		return empRepo.findAll();
	}
	
	@PutMapping(path="//update", consumes={"application/json"})
	public String editDepartment(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return "Updated employee";
	}
	
	@PostMapping("/add")
	public String addDepartment(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return "Added employee";
	}
}
