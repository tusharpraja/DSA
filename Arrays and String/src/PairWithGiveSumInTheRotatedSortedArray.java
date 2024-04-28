import java.util.Arrays;

public class PairWithGiveSumInTheRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {11,15,6,8,9,10};
        int target = 16;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }

        }

        return new int[] {-1,-1};

    }
}
