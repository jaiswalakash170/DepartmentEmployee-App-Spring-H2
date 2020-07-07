package com.akash.depemp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int DepartmentID;
	
	private String DepartmentName;
	
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + "]";
	}
}
