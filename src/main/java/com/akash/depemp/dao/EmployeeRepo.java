package com.akash.depemp.dao;

import org.springframework.data.repository.CrudRepository;
import com.akash.depemp.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
