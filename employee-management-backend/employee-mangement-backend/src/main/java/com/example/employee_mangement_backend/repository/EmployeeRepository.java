package com.example.employee_mangement_backend.repository;


import com.example.employee_mangement_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
