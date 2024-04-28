import java.util.Arrays;

public class Kth_LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int ans = findKthLargest(arr,k);
        int ans1 = findKthSmallest(arr,k);
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int findKthSmallest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k -1];
    }
}
