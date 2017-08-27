package com.fby.student;

public class Student5 {
    int id;
    String name;
    int age;
    
    // 构造方法重载
    Student5(int i, String n) {
        id = i;
        name = n;
    }

    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display1() {
        System.out.println(id + " " + name);
    }
    
    void display2() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display1();
        s2.display2();
    }
}