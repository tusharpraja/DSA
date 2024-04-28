import java.util.Arrays;
import java.util.HashSet;

public class Find_Common_Elements_Between_Two_Arrays {

    public static void main(String[] args) {
        int[] arr1 = {3,4,2,3};
        int[] arr2 = {1,5};

        int[] ans = findIntersectionValues(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }

//Example 1:
//
//Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
//Output: [3,4]
//Explanation: We calculate the values as follows:
//- The elements at indices 1, 2, and 3 in nums1 occur at least once in nums2. So the first value is 3.
//- The elements at indices 0, 1, 3, and 4 in nums2 occur at least once in nums1. So the second value is 4.
//Example 2:
//
//Input: nums1 = [3,4,2,3], nums2 = [1,5]
//Output: [0,0]
//Explanation: There are no common elements between the two arrays, so the two values will be 0.

    //My approach o(n2)
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[]=new int[2];
        int count1=0;
        int count2=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count1++;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    count2++;
                    break;
                }
            }
        }

        ans[0]=count1;
        ans[1]=count2;
        return ans;

    }

    //optimazed approach Using hashmap o(n+m)
        public static int[] findIntersectionValues2(int[] nums1, int[] nums2) {

            HashSet<Integer> hs1 = new HashSet<>();
            HashSet<Integer> hs2 = new HashSet<>();

            for(int i=0;i<nums1.length;i++) hs1.add(nums1[i]);
            for(int i=0;i<nums2.length;i++) hs2.add(nums2[i]);

            int ans[]= new int[2];

            int count=0;
            for(int i=0;i<nums1.length;i++)
            {
                if(hs2.contains(nums1[i])) count++;
            }
            ans[0]=count;
            count=0;

            for(int i=0;i<nums2.length;i++)
            {
                if(hs1.contains(nums2[i])) count++;
            }
            ans[1]=count;
            return ans;


        }


}
