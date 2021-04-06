package com.assignment3.LambdaEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStreams {
    public static void main(String[] args) {

        //Creating a List of type Employee
        List<Employee> employeeList = new ArrayList<Employee>();

        //Appending values to the list
        employeeList.add(new Employee(1,"CSE", 20000));
        employeeList.add(new Employee(2,"CSE", 30000));
        employeeList.add(new Employee(3,"IT", 20000));
        employeeList.add(new Employee(4,"EEE", 40000));
        employeeList.add(new Employee(5,"IT", 10000));
        employeeList.add(new Employee(5,"EEE", 50000));

        //Filtering employeeList with department and storing them in separate department Lists
        List<Integer> employeeCSE = employeeList.stream().filter(obj -> obj.department.equals("CSE")).map(obj1 -> obj1.salary).collect(Collectors.toList());
        List<Integer> employeeIT = employeeList.stream().filter(obj -> obj.department.equals("IT")).map(obj1 -> obj1.salary).collect(Collectors.toList());
        List<Integer> employeeEEE = employeeList.stream().filter(obj -> obj.department.equals("EEE")).map(obj1 -> obj1.salary).collect(Collectors.toList());

        //Iterating the lists to get the maximum salary in each list
        int CSESalary = findMaxForCSE(employeeCSE);
        int ITSalary = findMaxForIT(employeeIT);
        int EEESalary = findMaxForEEE(employeeEEE);

        //Printing the output
        System.out.println("CSE, "+CSESalary);
        System.out.println("IT, "+ITSalary);
        System.out.println("EEE, "+EEESalary);
    }

    private static int findMaxForEEE(List<Integer> employeeEEE) {
        return employeeEEE.stream().max((emp1, emp2) -> emp1 > emp2 ? 1:-1).get();
    }

    private static int findMaxForIT(List<Integer> employeeIT) {
        return employeeIT.stream().max((emp1, emp2) -> emp1 > emp2 ? 1 : -1).get();
    }

    private static int findMaxForCSE(List<Integer> employeeCSE) {
        return employeeCSE.stream().max((emp1, emp2) -> emp1 > emp2 ? 1 : -1).get();
    }
}
