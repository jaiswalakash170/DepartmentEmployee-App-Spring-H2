package com.akash.depemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.depemp.dao.DepartmentRepo;

@RestController
@RequestMapping("/department/")
public class DepartmentController {

	@Autowired
	DepartmentRepo depRepo;
	
	
}
