package Primitives;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    // using int and scanner class

    //     System.out.println("Enter the number");
    //     int rollno = input.nextInt();
    //     System.out.println("Your rollno is " + rollno);

    // Using String 

        // String name = input.next();
        // String name = input.nextLine();
        // System.out.println(name);

    // Using Float

    // float num = input.nextFloat();
    // System.out.println(num);

    // using Double

    // double num = input.nextDouble();
    // System.out.println(num);

    // using char

    // char word = input.next().charAt(0);
    // System.out.println(word);

    // using boolean

    boolean is = input.nextBoolean();
    System.out.println(is);
        
    }
}
