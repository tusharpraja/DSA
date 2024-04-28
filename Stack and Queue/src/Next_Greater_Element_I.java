import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_Element_I {
    // Nearest Greater to right
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] ans = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num: nums2){
            while (!stack.isEmpty() && num > stack.peek()){
                int item = stack.pop();
                map.put(item,num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
