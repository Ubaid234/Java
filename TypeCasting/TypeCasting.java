package TypeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Automatic conversion to float
        // float num = input.nextFloat();
        // System.out.println(num);

        // TypeCasting
        int num = (int)(89.89f);
        // System.out.println(num);

        // Automatic promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);// 257 % 256
        // System.out.println(b);

        // byte a = 30;
        // byte b = 40;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

        // Automatic conversion to ascii values
        // int number = 'A';
        // System.out.println(number);

        // Java follows unicode values
        // System.out.println("नमस्ते");

        byte b = 42;
        char c = 'a';
        int i = 50000;
        short s = 1024;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *b) + (i/c) - (d *s);
        // float + double  = double
        System.out.println((f * b) + " " + (i/c) + " " + (d * s));
        System.out.println(result);

        
    }

    
}
