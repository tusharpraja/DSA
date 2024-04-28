import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MergeIntervelOverlapping {
    public static void main(String[] args) {
        int intervals[][] = {
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };

        int[][] ans = merge(intervals);
        System.out.println(Arrays.toString(ans));
    }


    public static int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int total=intervals.length; //number of rows in the interval matrix
            int start=intervals[0][0];
            int end= intervals[0][1];
            List<int[]> mergedList= new ArrayList<>();
            for(int i=1;i<total;i++)
            {
                if(intervals[i][0]>end){
                    mergedList.add(new int[]{start,end});
                    start=intervals[i][0];
                    end=intervals[i][1];
                }
                else
                {
                    end=Math.max(end,intervals[i][1]);
                }
            }
            mergedList.add(new int[]{start,end});
            return mergedList.toArray(new int[mergedList.size()][]);
    }
}
