import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=0, b = 1, n = in.nextInt();

        for(int i=0; i<n; i++) {
            System.out.print(a + " ");
            int sum = a+b;
            a = b;
            b = sum;
        }
        in.close();
    }
}
