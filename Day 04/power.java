import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<= b; i++){
            ans = ans * a;
        }
        System.out.println("a power b : " + ans);
        sc.close();
    }
}
