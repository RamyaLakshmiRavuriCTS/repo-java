package com.assignmentweek2.person;

/*
This is the main method
 */
public class Main {
    public static void main(String[] args) {
        Student manoj = new Student("Manoj","Kurnool");
        Doctor ravi = new Doctor("Ravi","Hyderabad");
        Teacher suresh= new Teacher("Suresh","Nandyal");
        manoj.display();
        manoj.Address();
        ravi.display();
        ravi.Address();
        suresh.display();
        suresh.Address();
    }
}
