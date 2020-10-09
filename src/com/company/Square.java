package com.company;

public class Square {
    private float sideLength;

    public Square(float sideLength){
        this.sideLength = sideLength;
    }

    public float calculate_area(){
        float a = this.sideLength * this.sideLength;
        System.out.println("Your area is "+a);
        return a;
    }
    public float claculate_perimeter(){
       float p;
       p = this.sideLength*4;
       System.out.println("Your perimeter is "+p);
       return p;
    }
}
