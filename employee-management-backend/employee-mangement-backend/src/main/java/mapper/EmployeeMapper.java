package mapper;

import dto.EmployeeDto;
import entity.Employee;

public class EmployeeMapper {
    public Employee mapToEmployee(EmployeeDto employeedto){
        Employee employee = new Employee();
        employee.setId(employeedto.getId());
        employee.setAge(employeedto.getAge());
        employee.setDepartment(employeedto.getDepartment());
        employee.setName(employeedto.getName());
        employee.setEmail(employeedto.getEmail());
        return employee;
    }

    public EmployeeDto mapToEmployeedto(Employee employeedto){
        EmployeeDto employee = new EmployeeDto();
        employee.setId(employeedto.getId());
        employee.setAge(employeedto.getAge());
        employee.setDepartment(employeedto.getDepartment());
        employee.setName(employeedto.getName());
        employee.setEmail(employeedto.getEmail());
        return employee;
    }


}
