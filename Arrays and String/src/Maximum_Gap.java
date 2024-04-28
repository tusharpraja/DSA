import java.util.Arrays;

public class Maximum_Gap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }

    //Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.

    public static int maximumGap(int[] nums){
        Arrays.sort(nums);
        int low = 0;
        int max = 0;

        for (int i = 0; i < nums.length-1; i++) {
            low = nums[i+1] - nums[i];

            if (low > max){
                max = low;
            }
        }

        return max;
    }
}
