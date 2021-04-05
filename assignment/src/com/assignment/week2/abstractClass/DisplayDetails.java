package com.assignment.week2.abstractClass;

public class DisplayDetails extends PersonDetails {
    //extending abstact method to implement methods in it
    String name;
    String address;
    String role;
    String responsibilities;

    //overriding methods in PersonDetails class
    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    String getAddress() {
        return address;
    }

    @Override
    void setAddress(String address) {
        this.address = address;
    }

    @Override
    String getRole() {
        return role;
    }

    @Override
    void setRole(String role) {
        this.role = role;
    }

    @Override
    String getResponsibilities() {
        return responsibilities;
    }

    @Override
    void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;

    }

    public static void main(String[] args) {
        // creating 1st object for DisplayDetails class
        // In this main method we are inserting the data into the variables using getters,setters and printing the data
        DisplayDetails person1 = new DisplayDetails();
        person1.setName("Siva");
        person1.setAddress("Anaparthi");
        person1.setRole("Student");
        person1.setResponsibilities("Go to college and learn new things");
        System.out.println("Details of Person 1");
        System.out.println("Name = "+person1.getName());
        System.out.println("Address = "+person1.getAddress());
        System.out.println("Role = "+person1.getRole());
        System.out.println("Responsibilities = "+person1.getResponsibilities());
        System.out.println("\n");
// creating 2nd object for DisplayDetails class
        DisplayDetails person2 = new DisplayDetails();
        person2.setName("Surya");
        person2.setAddress("Rajahmundry");
        person2.setRole("Doctor");
        person2.setResponsibilities("Go to Hospital and treat patients");
        System.out.println("Details of Person 2");
        System.out.println("Name = "+person2.getName());
        System.out.println("Address = "+person2.getAddress());
        System.out.println("Role = "+person2.getRole());
        System.out.println("Responsibilities = "+person2.getResponsibilities());
        System.out.println("\n");
// creating 3rd object for DisplayDetails class
        DisplayDetails person3 = new DisplayDetails();
        person3.setName("Abhi");
        person3.setAddress("Vizag");
        person3.setRole("Teacher");
        person3.setResponsibilities("Go to school and deliver classes to students");
        System.out.println("Details of Person 3");
        System.out.println("Name = "+person3.getName());
        System.out.println("Address = "+person3.getAddress());
        System.out.println("Role = "+person3.getRole());
        System.out.println("Responsibilities = "+person3.getResponsibilities());

    }
}

