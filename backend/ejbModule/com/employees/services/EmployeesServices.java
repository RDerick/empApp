package com.employees.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.employees.IEmployee.IEmployees;
import com.employees.dto.EmployeeDTO;

@Stateless
@LocalBean
public class EmployeesServices implements IEmployees{

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDTO> findAllEmployees() {
		return em.createNamedQuery("Employee.findAll").getResultList();
	}

}
