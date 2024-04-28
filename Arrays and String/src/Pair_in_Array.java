import java.util.Arrays;

public class Pair_in_Array {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        pairArrays(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void pairArrays(int[] num){
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = 1; j < num.length; j++) {
                System.out.println(curr + "," + num[j]);
            }
        }

        System.out.println();
    }
}
// output
//        2,4
//        2,6
//        2,8
//        2,10
//        4,4
//        4,6
//        4,8
//        4,10
//        6,4
//        6,6
//        6,8
//        6,10
//        8,4
//        8,6
//        8,8
//        8,10
//        10,4
//        10,6
//        10,8
//        10,10
