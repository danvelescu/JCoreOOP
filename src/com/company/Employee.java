package com.company;

public class Employee {
    private final double tariffPerHour = 5.5;
    public int hours;

    public double getSallary() {
        return this.tariffPerHour * hours;
    }

    public double getTariffPerHour() {
        System.out.println(tariffPerHour);
        return tariffPerHour;
    }
}
