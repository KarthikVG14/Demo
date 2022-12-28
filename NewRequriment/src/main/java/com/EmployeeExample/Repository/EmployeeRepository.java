package com.EmployeeExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EmployeeExample.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	@Query("select * from employee e,employee_address a,employee_details d,employee_project_details dp where e.employee_id = :employee_id and a.employee_id = :employee_id and d.employee_id = :employee_id and dp.employee_id = :employee_id")
//	Employee getById(int employee_id);
}
