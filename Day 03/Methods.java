import java.util.Scanner;

class Num {
    int a, b;
    public void Number() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = in.nextInt();
        b = in.nextInt();
    }
}

class Sum extends Num {
    void Add() {
        
        System.out.println("Sum: " + (a+b));
    }
}
public class Methods {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.Number();
        obj.Add();
    }

}
