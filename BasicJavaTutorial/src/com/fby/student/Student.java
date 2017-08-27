package com.fby.student;

public class Student {
    int id;// field or data member or instance variable
    int rollno;
    String name;

    public static void main(String args[]) {
        Student s1 = new Student();// creating an object of Student
        System.out.println(s1.id);// accessing member through reference variable
        System.out.println(s1.name);
    }
    
    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}