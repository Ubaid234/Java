import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name : ");
        String greeting = input.nextLine();

        System.out.println("Welcome to the club " +greeting);

    }
}
