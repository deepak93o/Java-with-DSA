import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true) {

            //Take the operator from the user...

            System.out.print("Enter the operator: ");
            char ch = in.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                //Enter two numbers
                System.out.print("Enter two Numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if(ch == '+') {
                    ans = n1 + n2;
                }

                if(
                    ch == '-') {
                    ans = n1 - n2;
                }

                if(ch == '*') {
                    ans = n1 + n2;
                }

                if(ch == '/') {
                    if(n2 != 0) {
                    ans = n1 / n2;
                    }
                    else  {
                        System.out.println("Can't divide by Zero");
                        break;
                    }
                }
                if(ch == '%') {
                    ans = n1 % n2;
                }
                System.out.println("Answer = " + ans); 
            }

            // Loop will break after pressing X..

            else if(ch == 'X' || ch == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Input!!");
                break;
            }
        }
        
    }
}
