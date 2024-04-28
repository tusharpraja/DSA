import java.util.Arrays;

public class ChocolateDistributon {
    public static void main(String[] args) {

        int[] arr = {3,4,1,9,56,7,9,12};
        int n = arr.length;
        int m = 5;
        System.out.println(chocolate(arr,m,n));
    }

    public static int chocolate(int[] nums, int m, int n){
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < n; i++) {
            int diff = nums[i+m-1] - nums[i];
            if (diff < min){
                min = diff;
            }
        }

        return min;
    }
}
