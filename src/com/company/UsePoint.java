package com.company;

public class UsePoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(11);
        p1.setY(21);
        p1.setZ(33);
        p1.printPoint();

        Point p2 = new Point(18, 21, 33);
        p2.printPoint();


        Point p3 = new Point(11, 22);
        p3.printPoint();

    }
}
