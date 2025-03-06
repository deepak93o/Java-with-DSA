package package_java.pkg;

public class App2{
    public String str_1 = "Public Member Accessed !!";
    void printFromClass(){
        System.out.println("Within CLass: " + str_1);
    }
    public static void main(String[] args) {
        App2 obj = new App2();
        obj.printFromClass();
        System.out.println("Within class: " + obj.str_1);
        InnerApp obj2 = new InnerApp();
        obj2.printFromOut();
    }
}
