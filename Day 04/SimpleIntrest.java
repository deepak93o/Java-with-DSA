import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();
        System.out.print("Enter Rate of interest: ");
        float r = sc.nextFloat();

        float interest = (p * r * t) / 100;

        System.out.println("Principle: " + p + "\n" + "Rate: " + r + "\n" + "Time: " + t);

        System.out.println("Simple Interest: "+ interest);



    }
}
