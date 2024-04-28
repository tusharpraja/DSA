import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;
        int ans = subarraysDivByK(nums,k);
        System.out.println(ans);

    }

    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        int rem = 0;

        map.put(rem,1);
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            rem = sum % k;
            if(rem < 0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                ans = ans + map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        return ans;
    }
}
