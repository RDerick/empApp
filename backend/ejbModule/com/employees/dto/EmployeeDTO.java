package com.employees.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = -9115206641200606133L;
	
	private int empId;
	private String empName;
	private BigDecimal empSalary;
	private String empSurname; 
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

}
