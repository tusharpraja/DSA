import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {


//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false


    //2nd approach  efficient
    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <=k ){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    //1st approach
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }else {
                int PastIndex = hm.get(nums[i]);
                if (Math.abs((PastIndex - i))<=k){
                    return true;
                }else {
                    hm.put(nums[i],i);
                }
            }
        }

        return false;
    }
}
