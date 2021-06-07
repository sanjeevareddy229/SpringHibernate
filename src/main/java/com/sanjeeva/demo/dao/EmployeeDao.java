package com.sanjeeva.demo.dao;

import java.util.List;

import com.sanjeeva.demo.model.Employee;

public interface EmployeeDao {
	
	List<Employee> get(); 
	
	Employee get(int id); 
	void save(Employee employee);
	
	void delete(int id); 

}
