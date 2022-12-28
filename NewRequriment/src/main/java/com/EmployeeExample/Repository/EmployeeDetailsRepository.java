package com.EmployeeExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeExample.Model.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer>{

}
