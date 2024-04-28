import java.util.Stack;

public class Score_of_Parentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s) {
        final Stack <Integer> stack = new Stack<Integer>();
        int score = 0;
        for (int i=0; i<s.length(); ++i){   //() do hi hai eske alva kuch nhi hai array me
            if (s.charAt(i) =='('){
                stack.push(score);  //yaha par push kar diye ( esko else me ) yahi bacha toh pop kar liye score ki help se
                score = 0;
            }else {
                score = stack.pop() + (score == 0 ? 1:2 *score);
            }
        }
        return score;
    }
}

//Example 1:
//
//Input: s = "()"
//Output: 1
//Example 2:
//
//Input: s = "(())"
//Output: 2
//Example 3:
//
//Input: s = "()()"
//Output: 2
