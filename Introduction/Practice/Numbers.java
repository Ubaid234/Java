import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // Creating an input variable
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Writing if-else statement to check for even and odd
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Closing the input
        input.close();
    }
}
