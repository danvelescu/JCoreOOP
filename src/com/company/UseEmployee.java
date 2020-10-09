package com.company;

public class UseEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.hours = 100;
        System.out.println("Your sallary:" + e1.getSallary());
        e1.getTariffPerHour();

        Manager m1 = new Manager();
        m1.hours = 100;
        System.out.println("Sallary manager : " + m1.getSallary());
        m1.getTariffPerHour();
    }
}
