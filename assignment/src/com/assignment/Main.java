package com.assignment;
public class Main {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setAge(int age) {
        if(age>=0 && age<=100)
            this.age = age;
        else
            age = 0;
    }

    public boolean isTeen()
    {
        if((age>12) &&(age<20)){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(lastName.isEmpty()) {
            return firstName;
        } else if(firstName.isEmpty()) {
            return lastName;
        } else
            return firstName+ " " +lastName;
    }
public static void main (String[] args) {
        Main m = new Main();

        /* code */
        m.setFirstName("siva");
        m.setLastName("surya");
        m.setAge(20);
        m.isTeen();
        m.getFullName();
        }

}

