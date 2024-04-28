public class CountSpecialQuadruplets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6};
        System.out.println(countQuadruplets(nums));
    }

    //Explanation: The only quadruplet that satisfies the requirement is (0, 1, 2, 3) because 1 + 2 + 3 == 6.

    public static int countQuadruplets(int[] nums) {
        int count  = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    for(int l=k+1; l<nums.length; l++){
                        if(nums[i] + nums[j] + nums[k] == nums[l]){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
