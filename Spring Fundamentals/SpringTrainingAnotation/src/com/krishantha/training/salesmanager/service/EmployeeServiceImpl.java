package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.training.salesmanager.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService  {
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructore executted");
	}
	

	public EmployeeServiceImpl( EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructore executted");
		this.employeeRepository = employeeRepository;
	}
	
	@Autowired
	 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		 this.employeeRepository = employeeRepository;			 
		 
     }
	 
	 public EmployeeRepository getEmployeeRepository() {
		 
		 return employeeRepository;			 
		 
     }
	 
	 public List<Employee> getAllEmployee(){
		
		return employeeRepository.getAllEmployees();
	 }
	

}






