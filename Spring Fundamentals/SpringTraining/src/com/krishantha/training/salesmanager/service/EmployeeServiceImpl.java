package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import java.util.List;
import com.krishantha.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService  {
	
	
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployee(){
		
		
		return employeeRepository.getAllEmployees();
	}
	
	 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		 
			 this.employeeRepository = employeeRepository;
			 
	}

}
