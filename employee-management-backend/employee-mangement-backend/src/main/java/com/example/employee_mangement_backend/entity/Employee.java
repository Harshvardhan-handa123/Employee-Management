package com.example.employee_mangement_backend.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name = "Employees")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false , unique = true)
    private String email;

    @Column(name = "department")
    private String department;

    @Column(name = "age")
    private int age;

    public Employee() {
    }

    public Employee(String name, int id, String email, String department, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.department = department;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
