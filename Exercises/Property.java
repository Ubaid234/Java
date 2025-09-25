package Exercises;

public class Property {
    public static void main(String[] args) {
        double yield = calculatePropertyYield(1_300, 250_000);
        System.out.println(yield);
    }
    private static double calculatePropertyYield(
        double rent, double PropertyPrice
    ) {
        double yearlyRent = rent * 12;
        double yield = (yearlyRent / PropertyPrice) * 100;
        return yield;

    }
}

