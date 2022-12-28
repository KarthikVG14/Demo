package com.EmployeeExample.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private int ID;
	@Column(name = "project_name")
	private String projectName;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}
	public Project() {
		super();
	}
	
}
