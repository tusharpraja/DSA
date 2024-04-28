public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int l=1, r=1;
        int ans = nums[0];

        for(int i=0; i<n; i++){
            //if any of l or r become 0 then update it to 1
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;

            l *= nums[i];
            r *= nums[n-1-i];

            ans = Math.max(ans, Math.max(l,r));
        }

        return ans;
    }
}
