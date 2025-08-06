package Arrays;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        // Arrays

        int[] numbers = new  int[3];
        numbers[0] = 1;
        numbers[1] = 23;
        numbers[2] = 233;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {0,3,4,5,32,34,434,4};
        System.out.println(Arrays.toString(numbers2));
        numbers2[3] = 434;
         System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
         

        String[] names = {"Khalid", "sajid" , "rahil"};
        System.out.println(Arrays.toString(names));




    }
    
}
