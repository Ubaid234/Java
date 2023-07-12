import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting float and converting it into int
//        float num = input.nextFloat();
//        System.out.println(num);

        // Trying to convert int into float
//        int num = input.nextFloat();
//        System.out.println(num);
        // The above code will give error

        // To do this we have to do 'TYPECASTING'
        int num = (int)(34.434);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println((b)); // 257%256 = 1

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c;

//        System.out.println(d);

        int number = 'a';
        System.out.println(number); // gives ascii values.

        // Java supports unicode and thus we can do
//        System.out.println("سلام");

//        System.out.println(4 + 443.32);

    }
}
