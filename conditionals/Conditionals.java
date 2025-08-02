package conditionals;

public class Conditionals {
    public static void main(String[] args) {

        int salary = 20000;
        // IF ELSE STATEMENTS
        // if (salary > 10000) {
        //     salary = salary + 2000; 
        // } else {
        //     salary = salary + 1000;
        // }

        // MULTIPLE IF ELSE STATEMENTS
        // use bigger numbers first as if a conditions is true it is will execute that and skip the other ones even if they are true
        if (salary > 20000) {
            salary += 2000;     
        } else if(salary > 10000) {
            salary += 4000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
    
}
