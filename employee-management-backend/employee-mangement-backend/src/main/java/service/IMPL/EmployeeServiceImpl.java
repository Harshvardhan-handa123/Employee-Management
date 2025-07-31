package service.IMPL;

import dto.EmployeeDto;
import entity.Employee;
import mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import service.EmployeeService;


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
}
