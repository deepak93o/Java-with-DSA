import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();

        // int count = 0;
        // while(n > 0) {
        //     n = n/10;
        //     count++; 
        // }
        // System.out.println("Number of Digits: " + count);
        
//Numbers of time a same number occurs
        System.out.print("Enter number which you want to check:");
        int check = in.nextInt();
        int count = 0;
        in.close();
        while(n>0) {
            int rem = n%10;
            if(rem == check){
                count++;
            }
            n = n/10;
        }
        System.out.println("Number "+ check + " repeats " + count + " number of times");
    }
}
