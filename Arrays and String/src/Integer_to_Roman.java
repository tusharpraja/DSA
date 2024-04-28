public class Integer_to_Roman {
    public static void main(String[] args) {
        int nums = 13;
        String ans = intToRoman(nums);
        String ans2 = intToRoman2(nums);
        System.out.println(ans);
        System.out.println(ans2);
    }


    // Subtraction Methods
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        for(int i=0; num>0; i++){
            while(num >= val[i]){
                ans.append(rom[i]);
                num = num - val[i];
            }
        }

        return ans.toString();
    }


    //Division Methods   //EEfective way

    public  static String intToRoman2(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}
