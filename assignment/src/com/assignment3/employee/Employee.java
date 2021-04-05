package com.company;
//employee class with required fields
public class Employee {
    int employeeId;
    String department;
    int salary;
//creating constructor that instantiates the class
    public Employee(int employeeId,String department, int salary) {
        this.employeeId=employeeId;
        this.department = department;
        this.salary = salary;

    }

}
