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

    private static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    public static void main(String[] args) {
        int result = add(20, 20);
        int result2 = add(23, 34);
        System.out.println(result);
        System.out.println(result2);
    }
}
