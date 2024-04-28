import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {
        String as = "(()))";
        boolean ans = isBalanced(as);
        System.out.println(ans);
    }

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }else {
                if (st.size() == 0){
                    return false;
                }
                if (st.peek() == '('){
                    st.pop();
                }
            }

        }
        if (st.size() > 0){
            return false;
        }

        return true;
    }
}
