// Sum of the series: 
// S = 1 -2 + 3 -4...n

import java.util.Scanner;

public class seriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n range: 5");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=num; i++) {
            if(i % 2 == 0){
                sum = sum - i;
            }
            else{
                sum = sum + i;
            }
        }
        System.out.println("Sum of the Series is: " + sum);
    }
}
