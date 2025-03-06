import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.println("Hey how are you?");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine()); 

        input.close();
    }
}