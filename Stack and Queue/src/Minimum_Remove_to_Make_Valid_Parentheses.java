import java.util.Stack;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void main(String[] args) {

    }

    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] vis = new boolean[n];

        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n; i++){
            if (Character.isLowerCase(s.charAt(i))){
                continue;
            }
            if (s.charAt(i) == '('){
                stack.push(i);
            }else {
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    vis[i] = true;
                }
            }
        }
        while (!stack.isEmpty()){
            vis[stack.pop()] = true;
        }

        StringBuilder ans = new StringBuilder();
        for (int i=0; i<n; i++){
            if (!vis[i]){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}

//Example 1:
//
//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
//Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
//Example 2:
//
//Input: s = "a)b(c)d"
//Output: "ab(c)d"
//Example 3:
//
//Input: s = "))(("
//Output: ""
//Explanation: An empty string is also valid.
