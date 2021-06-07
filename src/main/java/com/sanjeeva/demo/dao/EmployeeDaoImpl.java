package com.sanjeeva.demo.dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanjeeva.demo.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager; 
	
	
	
	@Override
	public List<Employee> get() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class); 
		List<Employee> e= query.getResultList();
		return e;
	}

	@Override
	public Employee get(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee empObj = currentSession.get(Employee.class, id);
		return empObj;
	}

	@Override
	public void save(Employee employee) {
	
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
   
		Session currentSession = entityManager.unwrap(Session.class);
		Employee empObj = currentSession.get(Employee.class, id);
		currentSession.delete(empObj);
    	
	}

}
