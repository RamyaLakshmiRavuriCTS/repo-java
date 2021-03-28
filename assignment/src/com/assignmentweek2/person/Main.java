package com.assignmentweek2.person;

/*
This is the main method
 */
public class Main {
    public static void main(String[] args) {
        Student Manoj = new Student("Manoj","Kurnool");
        Doctor Ravi = new Doctor("Ravi","Hyderabad");
        Teacher Suresh= new Teacher("Suresh","Nandyal");
        Manoj.Studentdisplay();
        Manoj.StudentAddress();
        Ravi.Doctordisplay();
        Ravi.DoctorAddress();
        Suresh.Teacherdisplay();
        Suresh.TeacherAddress();
    }
}
