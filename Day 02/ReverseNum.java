import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.err.print("Enter a number:" );
        int num = in.nextInt();

        int a = 0;

        while(num > 0) {
            int rem = num % 10;
            num /= 10;

            a = a * 10 + rem;
        }
        System.out.println(a);
    }
}
