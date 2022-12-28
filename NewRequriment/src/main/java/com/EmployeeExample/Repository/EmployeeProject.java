package com.EmployeeExample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeExample.Model.Project;

public interface EmployeeProject extends JpaRepository<Project, Integer> {
	List<Project> findByIdIn(List<Integer> project_ids);
}
