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
@Table(name = "EMPLOYEE_ADDRESS")
public class EmployeeAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_address_id")
	private int ID;
	

	
	
	@Column(name = "house_no")
	private String houseNo;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "nation")
	private String nation;
	@Column(name = "pin")
	private String pin;
	
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@ManyToOne
	@JoinColumn(name = "employee_id",updatable = false,insertable = false)
	private Employee employee;
	
	

	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getHouseNo() {
		return houseNo;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public EmployeeAddress(String houseNo, String city, String state, String nation, String pin,Employee employee) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.nation = nation;
		this.pin = pin;
	}


	public EmployeeAddress() {
		super();
	}


	@Override
	public String toString() {
		return "EmployeeAddress [ houseNo=" + houseNo + ", city=" + city + ", state=" + state
				+ ", nation=" + nation + ", pin=" + pin + ", employeeId=" + employeeId + "]";
	}
	
	
	
}
