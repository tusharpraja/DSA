import java.util.Arrays;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }


    public static int search(int[] arr, int target){
        int peak = peekIndex(arr);
        int firstTry = OABS(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
       return OABS(arr,target,peak+1,arr.length-1);
    }

    public static int peekIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = (start + end)/2;

            if (arr[mid] > arr[mid+1]){
                //You are in dec.part of array
                end = mid;
            }else {
                start = mid+1;
            }
        }

        return start;
    }

    public static int OABS(int[] arr, int target, int Start, int End){

        boolean isAsc = arr[Start] < arr[End];

        while (Start <= End){
            int mid = (Start + End)/2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if(target > arr[mid]){
                    Start = mid +1;
                }else{
                    End = mid -1;
                }
            }else {

                if(target < arr[mid]){
                    Start = mid +1;
                }else{
                    End = mid -1;
                }

            }
        }
        return -1;
    }
}
