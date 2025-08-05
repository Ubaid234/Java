package Exercises;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // FIND THE LARGEST NUMBER 

        // assuming a to be large than condining over it
        // int max = a;
        // if (b > max) {
        //     max = b;
        // } 
        // if( c > max) {
        //     max = c;
        // }

        // Another method
        // int max = 0;
        // if(a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }

        // if (c > max){
        //     max = c;
        // }

        // Math method in java
        int max = Math.max(c,Math.max(a, b));
        
        System.out.println(max + " is the largest number");
    }
}
