package com.company;

public class Manager extends Employee {
    @Override
    public double getSallary() {
        return super.getSallary()+super.getSallary()/2;
    }
}
