//Decimal number to Binary Number

import java.util.Scanner;
public class dToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deciNum = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while(deciNum > 0) {
            int parity = deciNum % 2;
            ans += (parity * pw);
            pw *= 10;
            deciNum /=2;
        }
        System.out.println(ans);
    }
}
