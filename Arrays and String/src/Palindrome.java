public class Palindrome {
    public static void main(String[] args) {
        String name = "racecar";
        boolean ans = palindrome(name);
        System.out.println(ans);
    }

    public static boolean palindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
}
