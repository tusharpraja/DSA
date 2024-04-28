import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
