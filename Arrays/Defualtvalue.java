package Arrays;

import java.util.Arrays;

public class Defualtvalue {
    public static void main(String[] args) {
        // Arays Null Value

        int[] numbers = new int[3];
        numbers[2] = 43;
        // so the default value is 0 in Arrays
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[4];
        names[2] = " Raheen";
        // Here the defualt value for undefined values is null
        System.out.println(Arrays.toString(names));

        // we can also change the defualt value like

        int[]  num2 = new int[3];
        Arrays.fill(num2, 34);
        num2[1] = 4;
        System.out.println(Arrays.toString(num2));
    }
}
