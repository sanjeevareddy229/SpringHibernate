package com.sanjeeva.demo.service;

import java.util.List;

import com.sanjeeva.demo.model.Employee;

public interface EmployeeService {
	
List<Employee> get(); 
	
	Employee get(int id); 
	void save(Employee employee);
	
	void delete(int id); 

}
