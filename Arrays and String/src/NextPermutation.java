import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If no such element is found, reverse the whole array
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the smallest element greater than nums[i]
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }

        // Swap nums[i] and nums[j]
        swap(nums, i, j);

        // Reverse the elements from i+1 to the end
        reverse(nums, i + 1, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
