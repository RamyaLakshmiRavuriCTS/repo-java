package com.assignmentweek3.employee;

import java.util.ArrayList;


public class Employee extends Main {

    public String department;
    public int salary;

    public Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
