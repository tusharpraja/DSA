import java.util.LinkedList;
import java.util.Queue;

public class PrintFirstNegativeInteger {

    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
        long[] res = new long[n-k+1];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(a[i] < 0){
                q.offer(i);
            }
        }

        for(int i=0; i<=n-k; i++){
            if(q.size()>0 && q.peek() < i){
                q.poll();
            }

            if(q.size() > 0 && q.peek() <= i+k-1){
                res[i] = a[q.peek()];
            }
            else{
                res[i] = 0;
            }
        }
        return res;
    }
}
