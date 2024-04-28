import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        subarray(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public static void subarray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int first = i;

            for (int j = i; j < nums.length; j++) {
                int last = j;

                for (int k = first; k <= last; k++) {
                    System.out.println(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
