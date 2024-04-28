public class Make_Sum_Divisible_by_P {
    public static void main(String[] args) {

        int[] nums =  {6,3,5,2};
        int p = 9;
        int ans = minSubarray(nums,p);
        System.out.println(ans);
    }

    public static int minSubarray(int[] nums, int p) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <nums.length; j++) {
                if (nums[i] + nums[j] == p){
                    count++;
                }
            }
        }
        return count;
    }
}
