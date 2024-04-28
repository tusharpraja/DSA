import java.util.HashMap;

public class Two_Sum {


    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1};

        //Value , Index

        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int parent = target - nums[i];

            if (mp.containsKey(parent)){
                ans = new int[] {i, mp.get(parent)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
