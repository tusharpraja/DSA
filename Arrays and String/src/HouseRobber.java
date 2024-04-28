public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    //Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    //Total amount you can rob = 1 + 3 = 4.

    public static int rob(int[] nums) {
        int a=0, b=0;
        for(int i=0; i<nums.length; i++) {
            if(i%2==0)   a = Math.max(b, a+nums[i]);
            else  b = Math.max(a, b+nums[i]);
        }
        return Math.max(a,b);
    }
}

