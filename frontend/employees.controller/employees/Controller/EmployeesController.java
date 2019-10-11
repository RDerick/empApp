package employees.Controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.employees.dto.EmployeeDTO;
import com.employees.services.EmployeesServices;

@ManagedBean(name = "employeeController")
@SessionScoped
public class EmployeesController {

	@Inject
	public EmployeesServices employeesService;

	public List<EmployeeDTO> getAllEmployees() {
		return employeesService.findAllEmployees();  
	}
}
