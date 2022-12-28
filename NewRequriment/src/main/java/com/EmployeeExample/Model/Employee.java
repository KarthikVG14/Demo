package com.EmployeeExample.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int ID;
	@Column(name = "Name")
	private String name;
	@Column(name = "emailID")
	private String EmailId;
	@Column(name = "password")
	private String password;
	@Column(name = "wrong_password_attempts")
	private String wrongPasswordAttempts = "0";
	@Column(name = "is_blocked")
	private boolean isBlocked;
	
	
	
	
	@OneToMany(targetEntity = EmployeeAddress.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
	private List<EmployeeAddress> employeeAddress;
	
	@OneToMany(targetEntity = EmployeeProjectDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
	private List<EmployeeProjectDetails> employeeProjectDetails;
	
	
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "employee_id",referencedColumnName = "employee_id",updatable = false,insertable = false)
//	private EmployeeDetails empolyeeDetails;

	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private EmployeeDetails empolyeeDetails;
	
	
	
	public List<EmployeeProjectDetails> getEmployeeProjectDetails() {
		return employeeProjectDetails;
	}
	public void setEmployeeProjectDetails(List<EmployeeProjectDetails> employeeProjectDetails) {
		this.employeeProjectDetails = employeeProjectDetails;
	}
	public EmployeeDetails getEmpolyeeDetails() {
		return empolyeeDetails;
	}
	public void setEmpolyeeDetails(EmployeeDetails empolyeeDetails) {
		this.empolyeeDetails = empolyeeDetails;
	}
	public List<EmployeeAddress> getEmpAddress() {
		return employeeAddress;
	}
	public void setEmpAddress(List<EmployeeAddress> empAddress) {
		this.employeeAddress = empAddress;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWrongPasswordAttempts() {
		return wrongPasswordAttempts;
	}
	public void setWrongPasswordAttempts(String wrongPasswordAttempts) {
		this.wrongPasswordAttempts = wrongPasswordAttempts;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public Employee(String name, String EmailId, String password, String wrongPasswordAttempts, boolean isBlocked) {
		super();
		this.name = name;
		this.EmailId = EmailId;
		this.password = password;
		this.wrongPasswordAttempts = wrongPasswordAttempts;
		this.isBlocked = isBlocked;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmailId=" + EmailId + ", password=" + password + ", wrongPasswordAttempts="
				+ wrongPasswordAttempts + ", isBlocked=" + isBlocked + ", employeeAddress=" + employeeAddress
				+ ", empolyeeDetails=" + empolyeeDetails + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
