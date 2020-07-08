package com.akash.depemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akash.depemp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
