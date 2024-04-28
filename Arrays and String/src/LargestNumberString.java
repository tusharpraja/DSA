import java.util.Arrays;

public class LargestNumberString {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String ans = largestNumber(nums);
        System.out.println(ans);
    }


        public static String largestNumber(int[] nums) {
            String s[] = new String[nums.length];
            for(int i=0;i<nums.length;i++){
                s[i]=String.valueOf(nums[i]);   //It will conver String
            }
            StringBuilder sb=new StringBuilder("");
            Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));  //Sort
            for(String str:s)
            {
                sb.append(str);                //Add in string builder
            }
            String result=sb.toString();
            return result.startsWith("0")?"0":result;

        }


}
