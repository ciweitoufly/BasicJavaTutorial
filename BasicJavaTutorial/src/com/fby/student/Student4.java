package com.fby.student;

public class Student4 {
    int id;
    String name;
   // 构造函数
    Student4(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4(222, "Aryan");
        s1.display();
        s2.display();
    }
}