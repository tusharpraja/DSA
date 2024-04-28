public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {2,5,3,45,31,67};
        int target = 31;
        int ans = OABS(nums,target);
        System.out.println(ans);
    }


    //WE DONOT KNOW THAT ARRAY IS SORTED IS ASCENDING AND DESCENDING
    public static int OABS(int[] arr, int target){
        int Start = 0;
        int End = arr.length-1;

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
