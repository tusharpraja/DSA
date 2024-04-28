public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,5,3,45,31,67};
        int target = 31;
        int ans = Search(nums,target);
        System.out.println(ans);
    }

    public static int Search(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int SearchInRange(int[] nums, int target, int Start, int End){
        if (nums.length == 0){
            return -1;
        }
        for (int i = Start; i < End; i++) {
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    //Search in 2D

//    public static int[] SearchIn2D(int[][] nums, int target){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                if (nums[i][j] == target){
//                    return new int[][]{i,j};
//                }
//            }
//        }
//
//        return new int[][]{-1,-1};
//    }
}
