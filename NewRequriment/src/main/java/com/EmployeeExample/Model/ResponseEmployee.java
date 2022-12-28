package com.EmployeeExample.Model;

import javax.swing.RepaintManager;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
public class ResponseEmployee {	
	private String name;
	private String emailId;
	private String password;
	private String panNumber;
	private String adharNumber;
	private String homeNo;
	private String city;
	private String state;
	private String nation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
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
	public ResponseEmployee() {
		
	}
//	public void ResponseEmployee(Employee employee,EmployeeAddress empAddress,EmployeeDetails empDetails) {
//		ResponseEmployee responseEmployee = new ResponseEmployee();
//		responseEmployee.setName(employee.getName());
//		responseEmployee.setEmailId(employee.getEmailId());
//		responseEmployee.setHomeNo(empAddress.getHouseNo());
//		responseEmployee.setCity(empAddress.getCity());
//		responseEmployee.setState(empAddress.getState());
//		responseEmployee.setNation(empAddress.getNation());
//		responseEmployee.setAdharNumber(empDeatils.getAdharNumber());
//		responseEmployee.setPanNumber(employeeDetails.getPanNumber());
//		
//	}
	
	
}
