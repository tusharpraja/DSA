import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {

    public static void main(String[] args) {
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // Similar to next greater elements Question
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = n-1; i >= 0; i--) {
            //popping all indices with a lower or equal
            //temperature than the current index
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){        // index jada hai peek se toh pop kar do
                st.pop();
            }

            //if the stack still has element
            //then the next warmer temp exits
            if (!st.isEmpty()){
                ans[i] = st.peek() - i;  //top ans index subtract karke ans store karege
            }

            //Inserting current index in th stack
            st.push(i);
        }
        return ans;
    }
}

//Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
//Example 2:
//
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
//Example 3:
//
//Input: temperatures = [30,60,90]
//Output: [1,1,0]
