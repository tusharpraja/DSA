public class Number_of_Arithmetic_Triplets {

    public static void main(String[] args) {
       int[] arr = {0,1,4,6,7,10};
       int diff =  3;
       int ans = arithmeticTriplets(arr,diff);
        System.out.println(ans);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k] && nums[i] < nums[k]  && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

}
