package com.EmployeeExample.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.EmployeeExample.Model.Employee;
import com.EmployeeExample.Model.EmployeeAddress;
import com.EmployeeExample.Model.EmployeeDetails;
@Configuration
public class ServiceHelper {
	private static List<Employee> list1 = new ArrayList<Employee>();
	private static List<EmployeeAddress> list2 = new ArrayList<EmployeeAddress>();
	private static List<EmployeeDetails> list3= new ArrayList<EmployeeDetails>();
	
	static {
		
	}
}
