package com.EmployeeExample.Controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.EmployeeExample.Bean.RequestBean;
import com.EmployeeExample.Model.Employee;
import com.EmployeeExample.Model.EmployeeAddress;
import com.EmployeeExample.Repository.EmployeeRepository;
import com.EmployeeExample.ServiceImpl.EmployeeImplementation;
import com.EmployeeExample.helpers.HelperClass;

@RestController
public class EmployeeController {
	@Autowired
	private HelperClass helper;
	@Autowired
	EmployeeImplementation empImplemenatation;
	@PostMapping(value = "/insertData")
	public ResponseEntity<Object> GetFromRequest(@RequestBody RequestBean req) throws NoSuchAlgorithmException {

		System.out.println(req);
		Employee emp = helper.storeToEmployee(req);
		empImplemenatation.saveEmployee(emp);
//		return "Success";
		
		return new ResponseEntity<Object>(req, HttpStatus.OK);
	}

	
	@GetMapping(value = "/getById/{employee_id}")
	public Optional<Employee> byId(@PathVariable("employee_id") int employee_id){
		return empImplemenatation.findById(employee_id);
	}
	
//	@RequestMapping(value = "/updateEmployee/{id}")
//	public Employee updateEmployee(@PathVariable("id") int id,RequestBean req) {
//		 Optional<Employee> optionalEntity = empRepo.findById(id);
//		    if (optionalEntity.isPresent()) {
//		      Employee entity = optionalEntity.get();
//		      entity.setField(req);
//		      return empRepo.save(entity);
//	}
}
