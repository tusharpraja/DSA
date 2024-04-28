import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
     int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                return true;
            }
        }

        return false;
    }
}
