package service;

import dto.EmployeeDto;
import entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
