package TypeInference;

public class Main {

        // var keyword will only work for local variable thus the below code will through error i.e

        // private var brand = "Amigos" [wont work, as it is non local]

    public static void main(String[] args) {

        // Type Inference with var keyword 
        var name = "khalid";
        var names = new String[]{"Raheen", "Sehreen"};
        var age = 22;
        var isAdult = false;
        var balance = 1_000_000.33;

    }
    public static void printBrand(String brand) {
        // here again we can not use var keyword instead of string.
    }
}
