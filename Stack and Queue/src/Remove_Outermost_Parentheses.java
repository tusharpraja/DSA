public class Remove_Outermost_Parentheses {

    //Example 1:
    //
    //Input: s = "(()())(())"
    //Output: "()()()"
    //Explanation:
    //The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
    //After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
    //Example 2:
    //
    //Input: s = "(()())(())(()(()))"
    //Output: "()()()()(())"
    //Explanation:
    //The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
    //After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
    //Example 3:
    //
    //Input: s = "()()"
    //Output: ""
    //Explanation:
    //The input string is "()()", with primitive decomposition "()" + "()".
    //After removing outer parentheses of each part, this is "" + "" = "".

    public String removeOuterParentheses(String S){
       StringBuilder s = new StringBuilder();
       int opened = 0;

        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
}
