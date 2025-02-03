import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//Creating a basic Calculator using Switch Cases

        System.out.print("Enter Two numbers : ");
        
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.print("Enter the Operator: ");
        
        char ch = in.next().trim().charAt(0);

        switch (ch) {
            case '+' -> System.out.println("Addition: " + (num1+num2));
            case '-' -> System.out.println("Subtraction: " + (num1-num2));
            case '*' -> System.out.println("Multiplication: " + (num1*num2));
            case '/' -> {
                if(num2 != 0) {
                    System.out.println("Division: " + (num1/num2));
                    }
                    else {
                        System.out.println("Can't Divide by Zero");
                    }
            }
            case '%' -> System.out.println("Modulus: " + (num1%num2));
            default -> System.out.println("Invalid Input!!");
        }

    }
}
