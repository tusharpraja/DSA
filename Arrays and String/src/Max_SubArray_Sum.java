public class Max_SubArray_Sum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
//        maxSubArraySum(arr);
//        maxSubArraySum2(arr);
        Kadanes(arr);
    }

    // Brute Force
    public static void maxSubArraySum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                   currSum = currSum + nums[k];
                }

//                System.out.println(currSum);

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum is: " + maxSum);
        System.out.println();
    }


    // 2nd Approch

    public static void maxSubArraySum2(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        //Calculate the prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end]: prefix[end]-prefix[start-1];
                if (maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }

        System.out.println("Max Sum is: " + maxSum);
    }


    // 3rd Approch KADAE'S Alog:
    public static void Kadanes(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if (currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("Max subArray is: " + maxSum);
    }

    /*  leetCode
    * public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;

       for(int i=0; i<nums.length; i++){
          currSum = currSum + nums[i];
          maxSum = Math.max(currSum,maxSum);
          currSum = Math.max(currSum,0);
       }
       return maxSum;
    }

    */

}
