package com.example.employee_mangement_backend.service.IMPL;

import com.example.employee_mangement_backend.dto.EmployeeDto;
import com.example.employee_mangement_backend.entity.Employee;
import com.example.employee_mangement_backend.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import com.example.employee_mangement_backend.repository.EmployeeRepository;
import com.example.employee_mangement_backend.service.EmployeeService;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapper mapper;

    public EmployeeServiceImpl(EmployeeMapper mapper, EmployeeRepository employeeRepository) {
        this.mapper = mapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
       Employee employee = mapper.mapToEmployee(employeeDto);
       Employee savedEmployee = employeeRepository.save(employee);
       return mapper.mapToEmployeedto(savedEmployee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(mapper::mapToEmployeedto)
                .toList();
    }

    @Override
    public EmployeeDto getEmployeeById(int id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        return mapper.mapToEmployeedto(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        employeeRepository.delete(employee);
    }

    @Override
    public EmployeeDto updateEmployee(int id, EmployeeDto employeeDto) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        // You can update only allowed fields as per your logic
        existingEmployee.setName(employeeDto.getName());
        existingEmployee.setEmail(employeeDto.getEmail());
        existingEmployee.setDepartment(employeeDto.getDepartment());

        Employee updated = employeeRepository.save(existingEmployee);
        return mapper.mapToEmployeedto(updated);
    }

}
