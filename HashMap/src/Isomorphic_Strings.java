import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> mp = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            //Agar a = t , a = x, thatis not accaepetable that why this apply
            if (mp.containsKey(sCh)){
                if (mp.get(sCh) != tCh){
                    return false;
                }
            }else if (mp.containsValue(tCh)){  // nhi toh jo ham vale dal rhe hai wo toh ekajisits toh mhi kar ehi hai
                //do character ek single chez ko map nhi kar skte
                return false;
            }else {
                //nhi toh schar me t char ana cha hi ye
                mp.put(sCh,tCh);
            }
        }
        return true;
    }
}

//Example 1:
//
//Input: s = "egg", t = "add"
//Output: true
//Example 2:
//
//Input: s = "foo", t = "bar"
//Output: false
//Example 3:
//
//Input: s = "paper", t = "title"
//Output: true
