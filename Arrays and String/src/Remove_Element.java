import java.util.ArrayList;

public class Remove_Element {  //27 leetcode
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement1(arr,val));
    }


    //1st Approach
    public static ArrayList<Integer> removeElement1(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }

    //2nd Approach  Using two pointer

    // Intuition
    //The problem requires removing all occurrences of a given value val from the array nums and returning the new length of the array after removal.
    //
    //Approach
    //The approach uses a two-pointer technique. We iterate through the array with the first pointer (i) and, whenever we encounter an element equal to val, we swap it with the element at the end of the array (indexed by ind). This effectively removes the occurrence of val. We also decrement the ind pointer to indicate that the array's effective length has decreased.
    //
    //Complexity
    //Time complexity:
    //The algorithm makes a single pass through the array, and the swapping operation takes constant time.
    //
    //Space complexity:
    //The algorithm uses only a constant amount of extra space.

    public static int removeElement(int[] nums, int val) {
        int i=0;
        int ind = nums.length;
        while (i<ind){
            if (nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[ind-1];
                nums[ind-1] = temp;
                ind--;
            }else {
                i++;
            }
        }

        return ind;
    }

}

//Example 1:
//
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//Example 2:
//
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).
