public class Loops {
    public static void main(String[] args) {
         //For loop

         for (int i=0; i <= 10; i++) {
                System.out.println(i);
         }

         //While loop
         int a = 10;
         while(a >= 0) {
            System.out.println(a);
            a--;
         }

         //Do-While loop
         int b = 1, c = 2;
         System.out.println("Table of 2: ");
         do {
            System.out.println(c*b);
            b++;
         }while(b<=10);
        
    }
}