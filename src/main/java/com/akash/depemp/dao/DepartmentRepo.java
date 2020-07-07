package com.akash.depemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akash.depemp.models.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
