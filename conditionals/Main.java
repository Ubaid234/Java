package conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // OR (||) operator 
        
        System.out.println("Enter your gender: ");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();

        if (in.equalsIgnoreCase("Male")  || in.equalsIgnoreCase("Female")) {
            System.out.println("You are a valid gender");
        } else {
            System.out.println("You are a phony");
        } 

    }
}
