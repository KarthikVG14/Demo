package com.EmployeeExample.Configouration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.EmployeeExample.Bean.AddressBean;
import com.EmployeeExample.Bean.ProjectBean;
import com.EmployeeExample.Bean.RequestBean;
import com.EmployeeExample.ServiceImpl.EmployeeImplementation;

@Configuration
public class MyConfig {
	@Bean
	public RequestBean getRequest()
	{
		return new RequestBean();
	}
	@Bean
	public AddressBean getRequest1() {
		return new AddressBean();
	}
	@Bean
	public ProjectBean getRequest2() {
		return new ProjectBean();
	}
	public EmployeeImplementation getImpl() {
		return new EmployeeImplementation();
	}
}
