public class FindMinInRotetedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = findMin(arr);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {

        int res = nums[0];
        int left = 0, right = nums.length-1;

        //traverse
        while(left<=right){
            //how we know the res
            if(nums[left]<nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }
            int mid = (left+right)/2;
            res = Math.min(res, nums[mid]);
            if(nums[mid]>=nums[left]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }
}
