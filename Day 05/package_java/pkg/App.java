package package_java.pkg;

import java.util.Scanner;

public class App {
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        int Sum = a + b;

        System.out.println("Sum from App.java: " + Sum);
    }
}

class InnerApp {
    void printFromOut(){
        App2 obj = new App2();
        System.out.println("Within pkg, Outside class: " + obj.str_1);
    }
}