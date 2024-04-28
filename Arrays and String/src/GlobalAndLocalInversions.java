public class GlobalAndLocalInversions {
    public static void main(String[] args) {
        int[] nums = {1,0,2};
        System.out.println(isIdealPermutation(nums));
    }

    //Explanation: There is 1 global inversion and 1 local inversion.

    public static boolean isIdealPermutation(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(Math.abs(nums[i] - i) > 1){
                return false;
            }
        }

        return true;
    }
}
