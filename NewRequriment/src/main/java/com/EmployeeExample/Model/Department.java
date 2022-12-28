package com.EmployeeExample.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private int ID;
	@Column(name = "department_name")
	private String departmentName;
	
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	public Department() {
		super();
	}
	
}
