import java.math.BigInteger;

public class Multiply_Strings {
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "5";
        String ans = multiply(num1,num2);
        System.out.println(ans);
    }

    public static String multiply(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger result = big1.multiply(big2);
        return result.toString();
    }
}
