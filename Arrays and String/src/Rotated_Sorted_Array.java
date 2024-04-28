public class Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target =0;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    public static int Search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            }

            if (nums[start] <= nums[mid]){
                if (target > nums[mid] || target < nums[start]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if (target < nums[mid] || target > nums[end]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}





