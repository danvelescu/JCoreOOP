package com.company;

public class Circle extends GraphicObject{
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public double calculate_area(){
        double a = Math.PI * Math.exp(radius);
        System.out.println("area = " + a);
        return a;
    }

    public float claculate_perimeter(){
        float p = (float)(2 * Math.PI * radius);
        System.out.println("Circumference = "+ p);
        return p;
    }

}
