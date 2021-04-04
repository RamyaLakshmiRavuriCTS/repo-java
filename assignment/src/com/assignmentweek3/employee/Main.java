package com.assignmentweek3.employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    This is the main method
     */
    public static void main (String[] args) {
        Employee employee1= new Employee("CSE", 20000);
        Employee employee2= new Employee("CSE", 30000);
        Employee employee3= new Employee("IT", 20000);
        Employee employee4= new Employee("EEE", 40000);
        Employee employee5= new Employee("IT", 10000);

        ArrayList<Employee> employees =new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        List<Integer> employeeCSE = filteringCseDepartment(employees);
        List<Integer> employeeIT = filteringITDepartment(employees);
        List<Integer> employeeEEE = filteringEEEDepartment(employees);

        int CSESalary = employeeCSE.stream().max((emp1, emp2) -> emp1 > emp2 ? 1:-1).get();
        int ITSalary = employeeIT.stream().max((emp1, emp2) -> emp1 > emp2 ? 1:-1).get();
        int EEESalary = employeeEEE.stream().max((emp1, emp2) -> emp1 > emp2 ? 1:-1).get();

        System.out.println("CSE, "+CSESalary);
        System.out.println("IT, "+ITSalary);
        System.out.println("EEE, "+EEESalary);

    }
/*
This method is to separate EEE employees
 */
    private static List<Integer> filteringEEEDepartment(ArrayList<Employee> employees) {
        return employees.stream()
                    .filter(object -> object.department.equals("EEE"))
                    .map(object1 -> object1.salary)
                    .collect(Collectors.toList());
    }
    /*
    This method is to separate IT employees
     */
    private static List<Integer> filteringITDepartment(ArrayList<Employee> employees) {
        return employees.stream()
                    .filter(object -> object.department.equals("IT"))
                    .map(object1 -> object1.salary)
                    .collect(Collectors.toList());
    }
    /*
    This method is to separate CSE employees
     */
    private static List<Integer> filteringCseDepartment(ArrayList<Employee> employees) {
        return employees.stream()
                    .filter(object -> object.department.equals("CSE"))
                    .map(object1 -> object1.salary)
                    .collect(Collectors.toList());
    }
}
