package com.techelevator;

public class Employee {
    private static double salary = 60000;
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private String hireDate;
    private double employeeSalary;

    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.employeeSalary = salary;
    }

    public Employee() {
        this.employeeSalary = salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFullName() {
       String fullName = lastName + ", " + firstName;
       return fullName;
    }

    public void raiseSalary(double percent) {
        percent = percent / 100;
        employeeSalary = employeeSalary + (employeeSalary * percent);
    }

    public double getSalary() {
        return employeeSalary;
    }
}
