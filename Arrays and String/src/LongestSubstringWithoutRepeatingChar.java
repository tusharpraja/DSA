import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "Pwwkew";
        int ans = lengthOfLongestSubstring(str);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        //variable sliding window
        //it is like no. of k unique characters in a string
        int i=0, j=0;
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            if(map.size()==j-i+1){
                ans = Math.max(ans, map.size());
            }
            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}
