import java.util.HashSet;
import java.util.Set;

public class Number_of_Arithmetic_Triplets1 {

    public static void main(String[] args) {
        int[] arr = {0,1,4,6,7,10};
        int diff =  3;
        int ans = arithmeticTriplets(arr,diff);
        System.out.println(ans);
    }

    public static int arithmeticTriplets(int[] nums, int diff){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num: nums){
            if (set.contains(num - diff) && set.contains(num - diff*2)){
                count++;
            }
            set.add(num);
        }
        return count;
    }
}
