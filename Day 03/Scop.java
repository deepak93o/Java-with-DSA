public class Scop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a outside the block: " + a);
    
        {
            a = 30;
            int c = 40;
            System.out.println("a inside the block: " +a);
            System.out.println("C is inside the block: " + c);
        }
        // System.out.println(c); //Value initialized in block scope, will remain in the block
        change(10,20);
    }

   // System.out.println(a); //Can't use outside the block

    static void change(int a, int b) {
        a = 77;
        b = 88;

        System.out.println("In another method: " + "a: " + a + ", & b: " + b);
    }
}
