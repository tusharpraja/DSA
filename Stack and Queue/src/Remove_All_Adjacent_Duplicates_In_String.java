import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {

    }


    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String  result = "";
        for (int i = 0; i<s.length(); i++){
           char ch = s.charAt(i);

           if (stack.isEmpty() || stack.peek() != ch){   //Agar stack empty hai aur stack ke top par  jo latter hai wo match ma kare
               stack.push(ch);
           }else {
               stack.pop();
           }
        }

        while (!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }
}
//Example 1:
//
//Input: s = "abbaca"
//Output: "ca"
//Explanation:
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//Example 2:
//
//Input: s = "azxxzy"
//Output: "ay"
