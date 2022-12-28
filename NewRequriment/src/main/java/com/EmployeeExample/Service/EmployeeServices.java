package com.EmployeeExample.Service;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.EmployeeExample.Model.Department;
import com.EmployeeExample.Model.Employee;
import com.EmployeeExample.Model.EmployeeAddress;
import com.EmployeeExample.Model.EmployeeDetails;
import com.EmployeeExample.Model.EmployeeProjectDetails;
import com.EmployeeExample.Model.Project;
@Service
public interface EmployeeServices {
	public Employee saveEmployee(Employee employee); 
	Optional<Employee> findById(int employee_id);
	public EmployeeAddress saveEmployeeAddress(EmployeeAddress empAddress);
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empDetails);
	public Project saveProject(Project project);
	public Department saveDepartment(Department dept);
	public EmployeeProjectDetails saveProjectDetails(EmployeeProjectDetails empProjectDetails);
}
