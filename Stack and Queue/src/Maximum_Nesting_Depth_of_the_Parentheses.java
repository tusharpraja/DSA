public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";
        int ans = maxDepth(input);
        System.out.println(ans);
    }

    //Example 1:
    //
    //Input: s = "(1+(2*3)+((8)/4))+1"
    //Output: 3
    //Explanation: Digit 8 is inside of 3 nested parentheses in the string.
    //Example 2:
    //
    //Input: s = "(1)+((2))+(((3)))"
    //Output: 3
    //

    public static int maxDepth(String s){
        int res = 0;
        int cur = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '('){
                res = Math.max(res,++cur);
            }
            if (s.charAt(i) == ')'){
                cur = cur - 1;
            }
        }

        return res;
    }
}
