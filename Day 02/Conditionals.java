public class Conditionals {
    public static void main( String[] args) {
        int salary = 10000;

        if (salary >= 10000 && salary <= 20000) {
            salary += 2000;
        }
        else if (salary > 20000) {
            salary += 4000;
        }
        else {
            salary += 1000;
        }

        System.out.println("Salary:"+ salary);
    }
}
