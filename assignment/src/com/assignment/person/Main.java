package com.assignment.person;

public class Main {
    public static void main(String args[]){

        //main abstract class object
        Person p;

        //student object using abstract class object
        p=new Student("Hari","vijayawada");

        //displaying roles and responsibilities of doctor
        p.role();
        p.workResponsibilities();

        //teacher object using abstract class object
        p=new Teacher("Vijay", "Hyderabad");

        //displaying roles and responsibilities of teacher
        p.role();
        p.workResponsibilities();

        //doctor object using abstract class object
        p=new Doctor("Chaitanya","Vizag");
        //displaying roles and responsibilities of doctor
        p.role();
        p.workResponsibilities();
    }
}