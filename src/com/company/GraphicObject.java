package com.company;



abstract class GraphicObject {
    float calculate_area(Circle c){
        return (float) c.calculate_area();
    }
    float calculate_area(Rectangle r) {
        float a = r.getHeight() * r.getWidth();
        System.out.println("Area: " + a);
        return a;
    }
}
