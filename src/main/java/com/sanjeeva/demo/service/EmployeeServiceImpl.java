package com.sanjeeva.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanjeeva.demo.dao.EmployeeDaoImpl;
import com.sanjeeva.demo.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl; 
	
	@Transactional
	@Override
	public List<Employee> get() {
		
		return employeeDaoImpl.get(); 
	}

	@Transactional
	@Override
	public Employee get(int id) {
		
		return employeeDaoImpl.get(id); 
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDaoImpl.save(employee);
	}
	@Transactional
	@Override
	public void delete(int id) {
		employeeDaoImpl.delete(id);
	}

}
