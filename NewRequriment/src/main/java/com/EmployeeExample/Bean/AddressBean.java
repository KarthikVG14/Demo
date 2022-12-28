package com.EmployeeExample.Bean;

public class AddressBean {
	private String homeNo;
	private String city;
	private String state;
	private String nation;
	public String getHomeNo() {
		System.out.println(homeNo);
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
		System.out.println(homeNo);
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
	
	@Override
	public String toString() {
		return "AddressBean [homeNo=" + homeNo + ", city=" + city + ", state=" + state + ", nation=" + nation + "]";
	}
	public AddressBean(String homeNo, String city, String state, String nation) {
		super();
		this.homeNo = homeNo;
		this.city = city;
		this.state = state;
		this.nation = nation;
	}
	public AddressBean() {
		super();
	}
	
	
}
