import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bNum = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while(bNum > 0){
            int unitDigit = bNum % 10;
            ans += (unitDigit * pw);
            bNum /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
