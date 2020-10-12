package com.company;

public class Point {
    private int x, y, z;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void printPoint() {
        System.out.println("X:" + x + " Y:" + y + " Z:" + z);
    }
}
