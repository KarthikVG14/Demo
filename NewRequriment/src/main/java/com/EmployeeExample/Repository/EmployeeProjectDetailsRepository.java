package com.EmployeeExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeExample.Model.EmployeeProjectDetails;

public interface EmployeeProjectDetailsRepository extends JpaRepository<EmployeeProjectDetails, Integer> {

}
