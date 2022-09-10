package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import java.util.List;
import com.krishantha.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService  {
	
	
	EmployeeRepository employeeRepository;
	
	
	
    public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		 System.out.println("default constructor executed");
	}
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		// TODO Auto-generated constructor stub
    	
		 System.out.println("overload constructor executed");
		 this.employeeRepository = employeeRepository;	
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		 
		 this.employeeRepository = employeeRepository;			 
		 
     }
	 
	 public EmployeeRepository getEmployeeRepository() {
		 
		 return employeeRepository;			 
		 
     }
	 
	 public List<Employee> getAllEmployee(){
		
		return employeeRepository.getAllEmployees();
	 }
	

}






