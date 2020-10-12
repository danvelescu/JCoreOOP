package com.company;

public class Main {

    public static void main(String[] args) {
        /// 1
        Square s1 = new Square(20);
        s1.calculate_area();
        s1.claculate_perimeter();
        ///2
        Circle c1 = new Circle(20);
        c1.calculate_area();
        c1.claculate_perimeter();
        ///3
        Student st1 = new Student(10, "name1");
        Student st2 = new Student(11, "name2");
        st1.average(st2);

        ///8
        Rectangle r1 = new Rectangle(10, 20);
        r1.calculate_area();
        c1.calculate_area();


    }
}
