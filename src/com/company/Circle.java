package com.company;

public class Circle extends GraphicObject {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float calculate_area() {
        double a = Math.PI * Math.exp(radius);
        System.out.println("area = " + a);
        return (float) a;
    }

    public float claculate_perimeter() {
        float p = (float) (2 * Math.PI * radius);
        System.out.println("Circumference = " + p);
        return p;
    }

}
