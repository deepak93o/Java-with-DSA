import java.util.Arrays;
import java.util.Scanner;
// import java.util.SortedMap;

public class arrays {
    public static void main(String[] args) {
        //Syntax
        // datatype[] arrayName = new datatype[size];
        // int[] rollNo = new int[5];
        //or
        int[] rollNo1 = {43, 43, 56, 43,42};
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(rollNo1));

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }
        
        System.out.println(Arrays.toString(str));
    }
}
