import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        // Find the largest number
//
//        int max = a;
//        if(b > max) {
//            max = b;
//        } else if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);

        // Using Math.max
        int a = 43;
        int b = 94;

        int maxi = Math.max(a,b);

        System.out.println(maxi);
    }
}
