package controller;


import dto.EmployeeDto;
import entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;
import service.IMPL.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeedto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeedto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


}
