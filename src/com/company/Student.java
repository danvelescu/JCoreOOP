package com.company;

public class Student {
    private String name;
    private int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void set_data(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public float average(Student st) {
        float average;
        average = st.age + this.age / 2;
        System.out.println("Average age:" + average);
        return average;
    }
}
