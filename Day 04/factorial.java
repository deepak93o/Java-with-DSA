import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++){
                f = f * j;
            }
            System.out.println(i + "!" + " = "  + f);
            f = 1;
        }
        
    }
}
