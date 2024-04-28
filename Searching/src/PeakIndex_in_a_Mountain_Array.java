public class PeakIndex_in_a_Mountain_Array {
    public static void main(String[] args) {

    }

    //Find Peak Element same solution

    public static int peekIndex(int[] arr, int target){
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
}
