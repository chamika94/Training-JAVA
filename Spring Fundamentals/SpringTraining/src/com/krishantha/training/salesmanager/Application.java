package com.krishantha.training.salesmanager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;

public class Application {
	
	public static void main(String [] args) {
		
	/*	EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName()+" at "+ employee.getEmployeeLocation());
		}
		
	*/	
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}
		
		
	}

}
