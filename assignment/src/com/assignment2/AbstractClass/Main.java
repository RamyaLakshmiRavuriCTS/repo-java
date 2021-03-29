package com.company;

public class Main {

    public static void main(String[] args) {
        Roles r;
        r=new Student();
        r.setName("Vikram");
        r.setAddress("Bangalore");
        System.out.println("Student: "+r.getName()+" from "+r.getAddress());
        System.out.println(r.Roles());
        r=new Teacher();
        r.setName("Gandhi");
        r.setAddress("Chennai");
        System.out.println("Teacher: "+r.getName()+" from "+r.getAddress());
        System.out.println(r.Roles());
        r=new Doctor();
        r.setName("Sahil");
        r.setAddress("Kochi");
        System.out.println("Doctor: "+r.getName()+" from "+r.getAddress());
        System.out.println(r.Roles());
    }
}
