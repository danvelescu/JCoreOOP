package com.company;

public class Circle {
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public float calculate_area(){
        float a = (float) (Math.PI * Math.exp(radius));
        System.out.println("area = "+a);
        return a;
    }

    public float claculate_perimeter(){
        float p = (float)(2 * Math.PI * radius);
        System.out.println("Circumference = "+p);
        return p;
    }

}
