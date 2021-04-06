package com.assignment3.LambdaEmploye;

/*
*creating a class employee and declaring the required fields
 */
public class Employee {
    //Declaring required fields
    public int employeeId;
    public String department;
    public int salary;

    //Creating a constructor that instantiates this class
    public Employee (int employeeId, String department, int salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
}
