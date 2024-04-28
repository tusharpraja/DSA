public class SumofTwoIntegersWithoutOpertor {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int sum = getSum(a,b);
        System.out.println(sum);
    }

    public static int getSum(int a, int b) {
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        while(b != 0){
            int carry = a & b;
            a = a^b;
            b = carry <<1;
        }
        return a;
    }
}
