public class Sentence_Is_Pangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence) {
        for(char c='a';  c<='z'; c++){
            if(!sentence.contains(c+""))
                return false;
        }
        return true;
    }
}
