package com.EmployeeExample.Bean;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

public class RequestBean {
	private String name;
	private String emailId;
	private String password;
	private String panNumber;
	private String adharNumber;
	private int employeeId;
	private int departmentId;
	private List<AddressBean> address;
	private List<ProjectBean> details;

	@Override
	public String toString() {
		return "RequestBean [name=" + name + ", emailId=" + emailId + ", password=" + password + ", panNumber="
				+ panNumber + ", adharNumber=" + adharNumber + " Department Id : " + departmentId + "Employee Id : "
				+ employeeId + ", address=" + address + ", details=" + details + "]";
	}

	public List<AddressBean> getAddress() {
		return address;
	}

	public void setAddress(List<AddressBean> address) {
		this.address = address;
	}

	public List<ProjectBean> getDetails() {
		return details;

	}

	public void setDetails(List<ProjectBean> details) {
		this.details = details;
	}

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

	public void setHomeNo(AddressBean address) {

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public RequestBean(String name, String emailId, String password, String panNumber, String adharNumber,
			int employeeId, int departmentId, List<AddressBean> address, List<ProjectBean> details) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.address = address;
		this.details = details;
		this.employeeId = employeeId;
		this.departmentId = departmentId;
	}

	public RequestBean() {
		super();
	}

}
