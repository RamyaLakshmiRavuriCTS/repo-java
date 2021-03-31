package com.company;

public class Main {

    public static void main(String[] args) {
        //main abstract class object
        Person r;
        //student object using abstract class object
       r=new Student();
       //setting name and address of the student
        r.setName("Vikram");
        r.setAddress("Bangalore");
        //displaying name and address of the student
        System.out.println("Student: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of student
        System.out.println(r.Roles());
        //teacher object using abstract class object
        r=new Teacher();
        //setting name and address of the teacher
        r.setName("Gandhi");
        r.setAddress("Chennai");
        //displaying name and address of the teacher
        System.out.println("Teacher: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of teacher
        System.out.println(r.Roles());
        //doctor object using abstract class object
        r=new Doctor();
        //setting name and address of the doctor
        r.setName("Sahil");
        r.setAddress("Kochi");
        //displaying name and address of the doctor
        System.out.println("Doctor: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of doctor
        System.out.println(r.Roles());
    }
}
