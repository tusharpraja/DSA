public class InfinityArray {
    public static void main(String[] args) {
        
    }
    
    public static int ans(int[] arr, int target){
        //First Find the range
        //First start with a box of size 2
        
        int start = 0;
        int end = 1;
        
        //Condtion for the target to lie in the range
        while (target > arr[end]){
            int temp = end+1;   // this my new start
            
            //double the box value
            end = end+(end-start+1)*2; 
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    
    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
               return mid;
            }
        }
        return -1;
    }
}
