public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,5,3,45,31,67};
        int target = 31;
        int ans = BS(nums,target);
        System.out.println(ans);
    }

    public static int BS(int[] arr, int target){
        if(arr.length == 0){
            return -1;

        }

        int Start = 0;
        int End = arr.length-1;

        while (Start <= End){
            int mid = (Start + End)/2;

            if (target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                Start = mid +1;
            }else if (target < arr[mid]){
                End = mid -1;
            }
        }

        return -1;
    }
}
