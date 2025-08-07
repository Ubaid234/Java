package Switch;

public class Main {
    public static void main(String[] args) {
        // SWITCH STATEMENTS

        char grade = 'A';
        // Data types that can be used 
        // byte short int char enums String
        // Byte Short Integer Character
        switch (grade) {
            case 'A':
            // if i put an integer on case it will through error
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
            System.out.println("Pass");
                break;
            default:
            System.out.println("FAIL");
                
        }
        // SWITCH EXPRESSIONS IN LATTEST JAVA UPDATES

        // String result = switch (grade){
        //     case 'A' -> "Excellent";
        //     case 'B', 'C' -> "Pass";
        //     default -> "Fail";
        // };

        int result = switch (grade){
            case 'A' -> 2;
            case 'B', 'C' -> 4;
            default -> 5;
        };



        System.out.println(result);
    }
}
