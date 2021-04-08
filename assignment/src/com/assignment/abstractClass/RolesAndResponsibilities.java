package com.assignment.abstractClass;

//abstract class
abstract class RolesAndResponsibilities {
    //initializing parameters
    String name;
    String address;

    //abstract methods to get and set name
    abstract String getName() ;
    abstract void setName(String name) ;
    abstract String getAddress() ;
    abstract void setAddress(String address) ;

    //abstract method to display roles and responsibilities
    abstract String rolesAndResponsibilities();

}
