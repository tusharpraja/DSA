import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = setData(nums1);
        HashSet<Integer> set2 = setData(nums2);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int val : set1){
            if (set2.contains(val)){
                arrayList.add(val);
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public static HashSet<Integer> setData(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set;
    }
}

//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]

//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
