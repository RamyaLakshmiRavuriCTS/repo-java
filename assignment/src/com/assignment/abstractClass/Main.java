package com.assignment.abstractClass;

public class Main {
    public static void main(String args[]){

        //main abstract class object
        RolesAndResponsibilities r;

        //student object using abstract class object
        r = new Student();
        //setting name and address of the student
        r.setName("Sweetha");
        r.setAddress("Coimbatore");
        //displaying name and address of the student
        System.out.println("Student: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of doctor
        System.out.println(r.rolesAndResponsibilities());

        //teacher object using abstract class object
        r = new Teacher();
        //setting name and address of the teacher
        r.setName("Shanthi");
        r.setAddress("Bangalore");
        //displaying name and address of the teacher
        System.out.println("Teacher: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of teacher
        System.out.println(r.rolesAndResponsibilities());

        //doctor object using abstract class object
        r = new Doctor();
        //setting name and address of the doctor
        r.setName("Shanthosh");
        r.setAddress("Chennai");
        //displaying name and address of the doctor
        System.out.println("Doctor: "+r.getName()+" from "+r.getAddress());
        //displaying roles and responsibilities of doctor
        System.out.println(r.rolesAndResponsibilities());

    }
}
