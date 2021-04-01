package com.assignment.rolesAndResponsibilities;

//Extending class RolesAndResponsibilities and its methods
public class Person extends RolesAndResponsibilities {

    private String name;
    private String address;
    private String role;
    private String responsibilities;

    //Overriding all abstract methods in RolesAndResponsibilities class
    //Implementing them
    //All override methods acts as getters and setters of above variables
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
}
