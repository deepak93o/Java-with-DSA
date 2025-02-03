import java.util.Arrays;

public class ChnageValue {
    public static void main(String[] args) {
        int[] arr = {22,4,44,67};
        change(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums) {
        nums[0] = 77;
    }

}
