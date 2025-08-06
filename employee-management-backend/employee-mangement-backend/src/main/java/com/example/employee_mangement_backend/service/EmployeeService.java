package com.example.employee_mangement_backend.service;

import com.example.employee_mangement_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeById(int id);

    void deleteEmployee(int id);

    EmployeeDto updateEmployee(int id, EmployeeDto employeeDto);
}
