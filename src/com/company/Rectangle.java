package com.company;

public class Rectangle extends GraphicObject{
    private float width,height;

    Rectangle(float x, float y){
        this.width = x;
        this.height = y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}