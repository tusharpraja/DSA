public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double ans = findMaxAverage(nums,k);
        System.out.println(ans);
    }

    /* Intuition
The intuition behind solving the Maximum Average Subarray problem is to find the maximum average of a subaray of length k within the given array

Approach
The idea is to use a sliding window technique. By using this algorithm, we avoid recalculating the sum of subarrays from scratch for each positions, allowing us to efficiently find the maximum average subarray.

Complexity
Time complexity: O(N)
Space complexity: O(1) */

    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1 && k != 0){
            return nums[0]/k;
        }

        int curr = 0;
        int max = curr;
        for (int i = 0; i < k; i++) {
            curr = curr + nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            curr = curr + nums[i] - nums[i-k];
            max = Math.max(max,curr);
        }
        return (double) max/k;
    }
}


//Example 1:
//
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//Example 2:
//
//Input: nums = [5], k = 1
//Output: 5.00000