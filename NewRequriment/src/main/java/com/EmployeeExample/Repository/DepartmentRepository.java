package com.EmployeeExample.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeExample.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
//	Department findById(int id);

	Department findByDepartmentName(String departmentName);
}
