import java.util.Arrays;

public class Is_Subsequence {

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        boolean ans = isSubsequence(s,t);
        System.out.println(ans);
    }


    //Two pointer approach
    public static boolean isSubsequence(String s, String t) {
        if (s.length() ==0){
            return true;
        }
        int i=0;
        int j=0;

        while (j < t.length()){
            if (t.charAt(j) == s.charAt(i)){
                i++;
            }
            if (i == s.length()){
                return true;
            }
            j++;
        }

        return false;
    }
}

//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
