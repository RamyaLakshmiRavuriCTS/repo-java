package com.company;
//abstract class
abstract class Person {
    //initializing parameters
    String name;
    String address;
    //constructor
    public Person() {
        this.name = name;
        this.address = address;
    }
//getters and setters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String Roles(){
        return "";
    }

}
