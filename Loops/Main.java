package Loops;

public class Main {
    public static void main(String[] args) {
        
        // Loops and Arrays

        String[] names = {
            "khalid",// index 1
            "sajid",
            "rahil",
            "ahmed",
            "Sadiya"
        };

        System.out.println("For Loop");
        // CAN MAKE CHANGE WITH THIS LIKE USE METHODS
        for(int i=0; i < names.length; i++ ){
            System.out.println(names[i]);
        }

        System.out.println("Enhanced for loop");
        // CHANGES WON'T WORK HERE AND WOULDN'T AFFECT THE STRING EITHER 
        for(String name : names ) {
            System.out.println(name);
        }

    }
}
