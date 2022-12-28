package com.EmployeeExample.Bean;

public class ProjectBean {
	private int projectId;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public ProjectBean(int projectId, int departmentId, int employeeId) {
		super();
		this.projectId = projectId;
	}

	public ProjectBean() {
		super();
	}

	@Override
	public String toString() {
		return "ProjectBean [projectId=" + projectId + "]";
	}

}
