public class Remove_K_Digits {
    public static void main(String[] args) {
        String nums = "1432219";
        int k = 3;
        String ans = removeKdigits(nums,k);
        System.out.println(ans);
    }

    public static String removeKdigits(String num, int k) {
        int digits = num.length() - k;
        if (num.length() <= k) return "0";
        int top = -1, start = 0;
        char[] st = num.toCharArray();
        for (int i = 0; i < st.length; i++) {
            while (top >= 0 && st[top] > st[i] && k > 0) { //incresing to decreing than remove
                top--;
                k--;
            }
            top++;              // nhi toh nhi karna hai
            st[top] = st[i];
        }
        //Agar zero hot toh point ko aage kar do zero starting me nhi lena
        while (start <= top && st[start] == '0') start++;

        String ans = "";
        for(int i = start; i <digits; i++)
            ans = ans + st[i];

        if(ans.equals("")) return "0";
        return ans;
    }

    /*Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.*/
}
