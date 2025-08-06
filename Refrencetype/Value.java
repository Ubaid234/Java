package Refrencetype;

public class Value {
    public static void main(String[] args) {

        // Pass by value
        // java is always passed by value
        int age = 21;
        int ageCopy = increment(age);
        System.out.println(age);
        System.out.println(ageCopy);
    }

    static int increment(int age){
        return ++age;
    }
}
