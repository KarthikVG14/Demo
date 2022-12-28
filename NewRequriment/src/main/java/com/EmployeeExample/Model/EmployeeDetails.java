package com.EmployeeExample.Model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_details_id")
	private int ID;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "adhar_number")
	private String adharNumber;
	@Column(name = "pan_number")
	private String panNumber;
	@Column(name = "employee_id",insertable = false,updatable = false)
	private int employeeID;
	@Column(name = "department_id")
	private int departmentID;
	
	@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
	private Employee employee;
//	
//	@OneToOne(targetEntity = Department.class , cascade = CascadeType.ALL)
//	@JoinColumn(name = "department_id",referencedColumnName = "department_id")
//	private Department department;
	

	
	
//	@OneToOne(mappedBy = "empolyeeDetails")
//	private Employee employee;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id",updatable = false,insertable = false)
//	private Employee employee;
	
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public EmployeeDetails(Date dob, String adharNumber, String panNumber, int employeeID, int departmentID) {
		super();
		this.dob = dob;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.employeeID = employeeID;
		this.departmentID = departmentID;
	}
	public EmployeeDetails() {
		super();
	}
}
