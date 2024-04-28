public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums){
        int ans = 0;
        for (int i=0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}

//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1
