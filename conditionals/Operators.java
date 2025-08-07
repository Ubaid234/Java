package conditionals;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        // Operators with java
        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("You are a baby, back off");
        } else if( num >= 6 && num <18){
            System.out.println("You are not an adult yet");
        } else {
            System.out.println("You are an adult");
        }







    }
}
