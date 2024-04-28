import java.util.Arrays;

public class Single_Number_II {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int k = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[k]){
                j++;
            }
            if (j==3){
                k = i+1;
                j=0;
            }
        }
        return nums[k];
    }
}

/*public int singleNumber(int[] nums) {
       for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
       }
       return 1;
    }*/
