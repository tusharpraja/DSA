public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String str = "leetcode";
        int ans = consecutive(str);
        System.out.println(ans);
    }

    public static int consecutive(String str){
        int max = 1;
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                max = Math.max(max,count);
                count = 1;
            }

        }
        max = Math.max(count,max);
        return max;
    }
}
