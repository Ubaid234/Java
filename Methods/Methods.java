package Methods;

public class Methods {
    /*
         * Access Modifier
         * Return type
         * Name
         * Optional Parameters
         * Method Body 
         * Optional return value
         */

         // A Method that returns, it has two parameters n1 and n2 and takes two arguments respectively.
    private static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    // Here is a method that does not return anything and which can be invoked and used also 

    private static void printBrand(String brand){
        System.out.println(brand.toUpperCase());
    }

    // Another example for the same case
    // naming is camelCase in case of methods

    private static void isAdult(int age){
        if(age <= 17){
            System.out.println("You are not an adult accoding to English laws");
        } else {
            System.out.println("You get to be an adult");
        }
    }
    public static void main(String[] args) {
        int result = add(20, 20);
        int result2 = add(23, 34);
        System.out.println(result);
        System.out.println(result2);
        printBrand("kashmir");
        printBrand("free palestine");
        isAdult(23);
        isAdult(16);

    }
}
