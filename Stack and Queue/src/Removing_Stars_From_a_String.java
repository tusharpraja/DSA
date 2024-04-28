import java.util.Stack;

public class Removing_Stars_From_a_String {

    public static void main(String[] args) {
        String s = "leet**cod*e";
        String ans = removeStars(s);
        System.out.println(ans);
    }

    // My approach
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If the character is an asterisk, pop the top character from the stack (if not empty)
            if (ch == '*'){
                if (!st.isEmpty()){
                    st.pop();
                }
            }else {
                // Otherwise, push the character onto the stack
                st.push(ch);
            }
        }
        // Convert the contents of the stack back into a string        //ye socha nhi paya
        StringBuilder sb = new StringBuilder();
        for (char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}

//Example 1:
//
//Input: s = "leet**cod*e"
//Output: "lecoe"
//Explanation: Performing the removals from left to right:
//- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//There are no more stars, so we return "lecoe".
//Example 2:
//
//Input: s = "erase*****"
//Output: ""
//Explanation: The entire string is removed, so we return an empty string.
