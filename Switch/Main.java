package Switch;

public class Main {
    public static void main(String[] args) {
        // SWITCH STATEMENTS

        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
            System.out.println("Pass");
                break;
            default:
            System.out.println("FAIL");
                break;
        }
    }
}
