package com.akash.depemp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.depemp.dao.DepartmentRepo;
import com.akash.depemp.models.Department;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentRepo depRepo;
	
	@GetMapping("/show")
	public List<Department> showDepartments()
	{
		return depRepo.findAll();
	}
	
	@PutMapping(path="/update", consumes={"application/json"})
	public String editDepartment(@RequestBody Department dep)
	{
		depRepo.save(dep);
		return "Updated department";
	}
	
	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department dep)
	{
		depRepo.save(dep);
		return dep;
	}
}
