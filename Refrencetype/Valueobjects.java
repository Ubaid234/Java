package Refrencetype;

import java.awt.Point;

public class Valueobjects {
    public static void main(String[] args) {

        // Pass by value with Objects;

        Point pointA = new Point(10,10);
        Point pointB = pointA;

        pointA.x = 20;
        pointB.y = 40;

        // value changes in both points because they point towards the same refrence in the heap memory so changes made in one point will affect other becuase they share they same memory in the heap

        System.out.println(pointA);
        System.out.println(pointB);

        pointB = new Point(30,40);

        // here pointB is a new point and has different memory place in the heap so it would not affect the pointA here like above

        System.out.println(pointA);
        System.out.println(pointB);


    }
}
