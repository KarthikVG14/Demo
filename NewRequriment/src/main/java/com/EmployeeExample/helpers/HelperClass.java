package com.EmployeeExample.helpers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.EmployeeExample.Bean.AddressBean;
import com.EmployeeExample.Bean.ProjectBean;
import com.EmployeeExample.Bean.RequestBean;
import com.EmployeeExample.Model.Employee;
import com.EmployeeExample.Model.EmployeeAddress;
import com.EmployeeExample.Model.EmployeeDetails;
import com.EmployeeExample.Model.EmployeeProjectDetails;
import com.EmployeeExample.Model.Project;
@Service
public class HelperClass {
//	public boolean isPresent(int department_id) {
//	    String jdbcUrl = "jdbc:mysql://localhost:3306/employee1";
//	    String username = "root";
//	    String password = "Commando@12";
//	    try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password)){
//	    	Statement stmt = conn.createStatement();
//	        
//	        // Execute the SELECT query to check for the request ID
//	        ResultSet rs = stmt.executeQuery("SELECT * FROM requests WHERE request_id = '" + department_id + "'");
//	        
//	        // Check if the query returned any rows
//	        if (rs.next()) {
//	          // Request ID was found in the database
//	          System.out.println("Request ID '" + department_id + "' was found in the database.");
//	        } else {
//	          // Request ID was not found in the database
//	          System.out.println("Request ID '" + department_id + "' was not found in the database.");
//	        }
//	    } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public Employee storeToEmployee(RequestBean reqBean1) {
		Employee employee = new Employee();
		try {
			
			
			employee.setName(reqBean1.getName());
			employee.setEmailId(reqBean1.getEmailId());
			String password = encryptPassword(reqBean1.getPassword());
			employee.setPassword(password);
			
			List<EmployeeAddress> empolyeeAddress = storeToEmployeeAddress(reqBean1);
			System.out.println(empolyeeAddress+"Hereeeeeeeeeeee");
			employee.setEmpAddress(empolyeeAddress);
			
			EmployeeDetails empdetails = storeToEmployeeDetails(reqBean1);
			empdetails.setEmployee(employee);
			employee.setEmpolyeeDetails(empdetails);
			
			List<EmployeeProjectDetails> empProjectDetails = storeToEmployeProject(reqBean1);
			employee.setEmployeeProjectDetails(empProjectDetails);
			
			
			

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return employee;
	}
	public List<EmployeeAddress> storeToEmployeeAddress(RequestBean reqBean2) {
		List<EmployeeAddress> listAddress = new ArrayList<EmployeeAddress>();
		
		try {
			
			
			List<AddressBean> l1 = reqBean2.getAddress();
			for(AddressBean n:l1 ) {
				EmployeeAddress employeeAddress = new EmployeeAddress();
				System.out.println(n+"yooooooooo");
				employeeAddress.setHouseNo(n.getHomeNo());
				employeeAddress.setCity(n.getCity());
				employeeAddress.setState(n.getState());
				employeeAddress.setNation(n.getNation());
				listAddress.add(employeeAddress);
			}
			System.out.println(listAddress);
			
			
			

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return listAddress;
	}
	public List<EmployeeProjectDetails> storeToEmployeProject(RequestBean reqBean2) {
		List<EmployeeProjectDetails> listEmployeeProject = new ArrayList<EmployeeProjectDetails>();
		
		try {
			
			
			List<ProjectBean> l1stProject = reqBean2.getDetails();
			for(ProjectBean n:l1stProject ) {
				EmployeeProjectDetails empProjectDetails = new EmployeeProjectDetails();
				System.out.println(n+"here in project");
				empProjectDetails.setProjectID(n.getProjectId());
				listEmployeeProject.add(empProjectDetails);
			}

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return listEmployeeProject;
	}
	public EmployeeDetails storeToEmployeeDetails(RequestBean reqBean3) {
		EmployeeDetails empDetails = new EmployeeDetails();
		
		empDetails.setAdharNumber(reqBean3.getAdharNumber());
		empDetails.setPanNumber(reqBean3.getPanNumber());
		empDetails.setDepartmentID(reqBean3.getDepartmentId());		
		return empDetails;
	}
	
	public List<Project> storeToProject(RequestBean reqBean4) {
		List<Project> projectList = new ArrayList<Project>();
		Project project = new Project();
		List<ProjectBean> l2 = reqBean4.getDetails(); 
		for(ProjectBean p:l2) {
			project.setID(p.getProjectId());
			projectList.add(project);
		}
		return projectList;
	}
	
	public HelperClass() {
		
	}
	public String encryptPassword(String password) throws NoSuchAlgorithmException {
		System.out.println(password);
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte messageDigest[] = md.digest(password.getBytes());
		BigInteger bigInt = new BigInteger(1,messageDigest);
		
		return bigInt.toString(16);
	}
	
	public void storingDataToClasses(RequestBean reqBean) throws NoSuchAlgorithmException {

		try {
			Employee employee = new Employee();
			
			EmployeeAddress employeeAddress = new EmployeeAddress();
			List<EmployeeAddress> listAddress = new ArrayList<EmployeeAddress>();
			EmployeeDetails employeeDetails = new EmployeeDetails();
			
			
			String name = reqBean.getName();
			System.out.println(name);
			String emailId = reqBean.getEmailId();
			System.out.println(emailId);
			String password = reqBean.getPassword();
			System.out.println(password);
			String panNumber = reqBean.getPanNumber();
			String adharNumber = reqBean.getAdharNumber();
			System.out.println(adharNumber);
			List<AddressBean> l1 = reqBean.getAddress();
			for(AddressBean n:l1 ) {
				employeeAddress.setHouseNo(n.getHomeNo());
				employeeAddress.setCity(n.getCity());
				employeeAddress.setState(n.getState());
				employeeAddress.setNation(n.getNation());
				listAddress.add(employeeAddress);
			}
			System.out.println(listAddress);
//			List l1 = reqBean.getAddress();
//			System.out.println(l1);
//			System.out.println(city);
//			String state = reqBean.getState();
//			String nation = reqBean.getNation();
//			String homeNo = reqBean.getHomeNo();
//			int departmentId = reqBean.getDepartmentId();
//			int projectId = reqBean.getProjectId();
//			System.out.println(projectId);

			// Encrypting the input String password
			HelperClass helper = new HelperClass();
			String encrpytedPassword = helper.encryptPassword(password);
			System.out.println(encrpytedPassword);

			employee.setName(name);
			employee.setEmailId(emailId);
			
			employee.setPassword(encrpytedPassword);
			System.out.println(employee);
			employeeDetails.setPanNumber(panNumber);
			employeeDetails.setAdharNumber(adharNumber);
			employeeDetails.setPanNumber(reqBean.getPanNumber());
			System.out.println(employeeDetails);
			
			
			
//			employeeAddress.setCity(city);
//			employeeAddress.setHouseNo(homeNo);
//			employeeAddress.setState(state);
//			employeeAddress.setNation(nation);
			
			System.out.println(employee.getName());

		} catch (Throwable t) {
			t.printStackTrace();
		}
		

	}
	

}
