import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Based on current value 13/07/2023
        System.out.println("Enter the value in USD");
        int number = input.nextInt();
        float currency = (float) (number * 82.10);

        System.out.println("The value in INR is: " +currency);

    }
}
