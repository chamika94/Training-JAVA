package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.krishantha.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		// TODO Auto-generated constructor stub
    	
		 System.out.println("overload constructor executed");
		 this.employeeRepository = employeeRepository;	
	}
	
    public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		 System.out.println("default constructor executed");
	}

	 public EmployeeRepository getEmployeeRepository() {
		 
		 return employeeRepository;			 
		 
     }
	 
	 @Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed");
		 this.employeeRepository = employeeRepository;			 
		 
     }
	 

	 
	 public List<Employee> getAllEmployee(){
		
		return employeeRepository.getAllEmployees();
	 }
	

}






