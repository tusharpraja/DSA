import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[])
    {
        int i, j, temp;
        for (i = 0; i < arr.length-1; i++) {
            for (j = 1; j < arr.length-1; j++) {
                if (arr[j] < arr[j - 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }
}
