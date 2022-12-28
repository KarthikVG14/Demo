package com.EmployeeExample.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "employee_project_details")
public class EmployeeProjectDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_project_details_id")
	private int ID;
	@Column(name = "employee_id")
	private int employeeID;
	@Column(name = "project_id")
	private int projectID;
	
//	@ManyToOne
//	@JoinColumn(name = "employee_id",updatable = false,insertable = false)
//	private Employee employee;
	
	
	
	
	
	
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public EmployeeProjectDetails(int employeeID, int projectID) {
		super();
		this.employeeID = employeeID;
		this.projectID = projectID;
	}
	public EmployeeProjectDetails() {
		super();
	}
	
}
