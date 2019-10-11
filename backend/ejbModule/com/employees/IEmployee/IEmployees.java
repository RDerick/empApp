package com.employees.IEmployee;

import java.util.List;

import com.employees.dto.EmployeeDTO;

public interface IEmployees {
	List<EmployeeDTO> findAllEmployees();
}
