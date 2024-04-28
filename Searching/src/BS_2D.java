import java.util.Arrays;

public class BS_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {34,56,33,22},
                {6,4,21,77,66},
        };
        int target = 77;
        System.out.println(Arrays.toString(BS2D(arr,target)));
    }

    public static int[] BS2D(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[] {r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }

        return new int[] {-1,-1};
    }
}
