import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {

    }


    //esme har value ki frq store kar rhe hai and than compaire kar rhe hai

    public static HashMap<Character, Integer> maxFeq(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int  i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            }else {
                int currFeq = mp.get(ch);
                mp.put(ch,currFeq + 1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> mp1 = maxFeq(s);
        HashMap<Character,Integer> mp2 = maxFeq(t);

        if (mp1.equals(mp2)){
            return true;
        }
        return false;
    }
}

//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
