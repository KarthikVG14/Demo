package com.EmployeeExample.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeExample.Model.Department;
import com.EmployeeExample.Model.Employee;
import com.EmployeeExample.Model.EmployeeAddress;
import com.EmployeeExample.Model.EmployeeDetails;
import com.EmployeeExample.Model.EmployeeProjectDetails;
import com.EmployeeExample.Model.Project;
import com.EmployeeExample.Repository.DepartmentRepository;
import com.EmployeeExample.Repository.EmployeeDetailsRepository;
import com.EmployeeExample.Repository.EmployeeProject;
import com.EmployeeExample.Repository.EmployeeRepository;
import com.EmployeeExample.Service.EmployeeServices;
@Service
public class EmployeeImplementation implements EmployeeServices{
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Autowired
	private EmployeeDetailsRepository empDetailsRepository;
	@Autowired
	private EmployeeProject projectRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		//null check validations
		//create response bean object
		//autowire ID
		Optional<Department> deptdepartment = deptRepo.findById(1);
        if (!(deptdepartment.isPresent())) {
        	
        }
        Set<Integer> demo = new ArrayList<Integer>();
        List<Project> projectList = projectRepo.findByIdIn(demo);
        
		//call the method store to employee that accepts Request bean 

		return empRepository.save(employee);
	}
	@Override
	public EmployeeAddress saveEmployeeAddress(EmployeeAddress empAddress) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empDetails) {
		return empDetailsRepository.save(empDetails);
	}
	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EmployeeProjectDetails saveProjectDetails(EmployeeProjectDetails empProjectDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Employee> findById(int employee_id) {
		// TODO Auto-generated method stub
		return empRepository.findById(employee_id);
	}
		
	
	

	
	
}
