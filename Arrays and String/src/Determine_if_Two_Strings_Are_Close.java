import java.util.Arrays;

public class Determine_if_Two_Strings_Are_Close {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        boolean ans = closeStrings(word1,word2);
        boolean ans2 = closeStrings2(word1,word2);
        System.out.println(ans);
        System.out.println(ans2);
    }


    // Pura test case pass nhi huaa
    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()){
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    //Right Answer // Fequence store;
    public static boolean closeStrings2(String word1, String word2) {
            if(word1.length()!=word2.length())return false;
            if(word1.equals(word2))return true;

            int[] freq1=new int[26];
            for(char c:word1.toCharArray())freq1[c-'a']++;
            int[] freq2=new int[26];
            for(char c:word2.toCharArray())freq2[c-'a']++;

            for(int i=0;i<26;i++){
                //counting that equal number of distinct char present in both word
                if((freq1[i]==0&&freq2[i]!=0)||(freq1[i]!=0&&freq2[i]==0)){
                    return false;
                }
            }

            Arrays.sort(freq2);
            Arrays.sort(freq1);

            for(int i=0;i<26;i++){
                //Now when equal number of char are sorted they will appear in same order while traversing the array
                //meaning if we have freq of a=1 b=2 c=1 in word 1 & a=1 b=1 c=2 in word 2 they will appear in order
                //word1 freq1 = 1,1,2 and word2 freq2 = 1,1,2
                if(freq1[i]!=freq2[i])return false;
            }

            return true;
    }

}
