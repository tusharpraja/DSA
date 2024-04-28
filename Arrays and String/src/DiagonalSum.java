import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        int ans = Sum(matrix);
        System.out.println(ans);
    }

    //O(n^2)
    public static int DiagonalSum(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j){
                    sum = sum + matrix[i][j];
                }else if(i+j == matrix.length-1) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        return sum;
    }

    //O(n)

    public static int Sum(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //PD
            sum = sum + matrix[i][i];
            //SD
            if (i != matrix.length-1-i){
                sum = sum + matrix[i][matrix.length-i-1];
            }
        }

        return sum;
    }
}
