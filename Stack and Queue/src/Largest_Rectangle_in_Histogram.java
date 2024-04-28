import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public int largestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        //Calculate nse[]

        st.push(n-1);   //index
        nse[n-1] = n;

        for (int i = n-2; i >=0; i--) {
            while (st.size() >0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if (st.size() == 0){
                nse[i] = n;
            }else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        //Emptying stack
        while(st.size() > 0){
            st.pop();
        }

        //Calculate pse[]

       st.push(0);
       pse[0] = -1;
       for (int i=1; i<= n-1; i++){
           while (st.size() > 0 && heights[st.peek()] >= heights[i]){
               st.pop();
           }
           if (st.size() == 0){
               pse[i] = -1;
           }else {
               pse[i] = st.peek();
           }
           st.push(i);
       }

       //Maximum area of rectangle
        int max = -1;
       for (int i=0; i<n; i++){
           int area = heights[i] * (nse[i] - pse[i] - 1);
           max = Math.max(max,area);
       }
       return max;
    }
}

//Input: heights = [2,1,5,6,2,3]
//Output: 10
//Explanation: The above is a histogram where width of each bar is 1.
//The largest rectangle is shown in the red area, which has an area = 10 units.
