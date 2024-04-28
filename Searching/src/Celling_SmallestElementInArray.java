public class Celling_SmallestElementInArray {
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,14,16,18};
        int target = 15;
        int ans = celling(nums,target);
        System.out.println(ans);
    }


    public static int celling(int[] arr, int target){
        if (target > arr[arr.length-1]){
            return -1;
        }
        int Start = 0;
        int End = arr.length-1;

        while (Start <= End){
            int mid = (Start + End)/2;

            if (target < arr[mid]){
                End = mid-1;
            }else if (target > arr[mid]){
                Start = mid+1;
            }else {
                return mid;
            }
        }

        return Start;
    }
}
