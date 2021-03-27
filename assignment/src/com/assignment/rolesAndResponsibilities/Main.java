package com.assignment.rolesAndResponsibilities;

public class Main {
    public static void main(String[] args) {

        String name,address,role,responsibilities;

        //Instantiating an object to access methods of person class
        Person person = new Person();

        person.setName("Nihil");
        name = person.getName();
        person.setAddress("Chennai");
        address = person.getAddress();
        person.setRole("Doctor");
        role = person.getRole();
        person.setResponsibilities("treat all OPs this evening.");
        responsibilities = person.getResponsibilities();

        System.out.println("Hi I am "+name+" from "+address+". I am a "+role+" and I will "+responsibilities);

        person.setName("Suresh");
        name = person.getName();
        person.setAddress("Coimbatore");
        address = person.getAddress();
        person.setRole("Teacher");
        role = person.getRole();
        person.setResponsibilities("finish my portion within this week.");
        responsibilities = person.getResponsibilities();

        System.out.println("Hi I am "+name+" from "+address+". I am a "+role+" and I will "+responsibilities);

        person.setName("Dayasudan");
        name = person.getName();
        person.setAddress("Theni");
        address = person.getAddress();
        person.setRole("Student");
        role = person.getRole();
        person.setResponsibilities("clear all my arrears in final semester.");
        responsibilities = person.getResponsibilities();

        System.out.println("Hi I am "+name+" from "+address+". I am a "+role+" and I will "+responsibilities);
    }
}
