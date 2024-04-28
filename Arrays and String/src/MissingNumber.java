import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return nums.length;
    }
}
