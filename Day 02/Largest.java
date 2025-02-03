import java.util.Scanner;
import java.math.*;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // if(a > b && a > c) {
        //     System.out.println(a + " 55is the largest number");
        // }
        // else if (b > a && b > c) {
        //     System.out.println(b + " is the largest number");

        // }
        // else if(c > b && c > a) {
        //     System.out.println(c + " is the largest number");
        // }
        // else {
        //     System.out.println("All numbers are equal");
        // }

        // Using Math.max() method
        int max = Math.max(c, Math.max(a, b));
    
        System.out.println(max + " is the Largest number");
    }
}