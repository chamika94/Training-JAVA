package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import java.util.List;
import com.krishantha.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService  {
	
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployee(){
		
		
		return employeeRepository.getAllEmployees();
	}

}
