import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int idx = 0;

        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;

            }else{
                break;
            }
        }

        return s1.substring(0,idx);
    }
}
