package Refrencetype;

import java.awt.Point;

public class Refrence {
    public static void main(String[] args) {
        // Reference type / Objects
        int num = 20;

        Point pointA = new Point(10, 10);
        System.out.println(pointA);
        pointA.move(10, 11);
        System.out.println(pointA);
    }
}
