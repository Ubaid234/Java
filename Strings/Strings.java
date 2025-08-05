package Strings;

public class Strings {
    public static void main(String[] args){
        // Strings

        // String umaid = "1 ";
        // String code = "1";
        // String brand = umaid + code;

        String umaid = "Umaid";
        String code = "codes";
        String brand = umaid + code;
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0,5));
        System.out.println(brand.substring(5));
        System.out.println(" ".isEmpty());
        System.out.println("      ".isBlank());
        System.out.println(" a  ".trim());
    }
}
