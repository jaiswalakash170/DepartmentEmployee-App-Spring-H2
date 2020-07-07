package com.akash.depemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.depemp.dao.EmployeeRepo;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

	@Autowired
	EmployeeRepo empRepo;
	
	
}
