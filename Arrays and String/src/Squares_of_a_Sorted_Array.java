import java.util.ArrayList;
import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares1(arr)));

    }

    //My apporach

    public static int[] sortedSquares1(int[] nums) {
        int n=nums.length;
        int arr2[]=new int[n];
        for(int i=0;i<nums.length;i++){
            arr2[i]=nums[i]*nums[i];
        }

        Arrays.sort(arr2);
        return arr2;
    }

    public static int[] sortedSquares(int[] nums) {

        return  Arrays.stream(nums).map(x -> x*x).sorted().toArray();
    }
}


//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]