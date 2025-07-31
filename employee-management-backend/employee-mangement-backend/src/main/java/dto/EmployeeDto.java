package dto;

public class EmployeeDto {
    private int id;
    private String name;
    private String email;
    private String department;
    private int age;

    public EmployeeDto(String email, int id, String name, String department, int age) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public EmployeeDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
