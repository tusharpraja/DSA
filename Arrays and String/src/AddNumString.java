import java.math.BigInteger;

public class AddNumString {
    public static void main(String[] args) {
       String num1 = "111";
       String num2 = "123";

       String ans = String.valueOf((new BigInteger(num1).add(new BigInteger(num2))));
        System.out.println(ans);
    }

}
