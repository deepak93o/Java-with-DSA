// import package_java.pkg.App;
import package_java.pkg.App2;

public class outsidepkg {
    public static void main(String[] args) {
        // App obj = new App();
        // App2 obj2 = new App2();
        // obj.sum();

        // System.out.println("Outside Pkg: " + obj2.str_1);

        App3 obj3 = new App3();
        obj3.printFromChild();
    }

}

class App3 extends App2{
    void printFromChild() {
        App3 obj3 = new App3();
        System.out.println("From Child Class: " + obj3.str_1);
    }
}
