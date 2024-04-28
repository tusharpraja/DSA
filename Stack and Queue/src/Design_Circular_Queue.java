import java.util.LinkedList;
import java.util.Queue;

public class Design_Circular_Queue {

    static int arr[]=new int[1000],k,front,end;

    public void MyCircularQueue(int k) {
        this.k=k;
        front=end=0;
    }

    public boolean enQueue(int value) {
        if(end-front==k) return false;
        arr[end%k]=value;
        end++;
        return true;
    }

    public boolean deQueue() {
        if(front==end) return false;
        front++;
        return true;
    }

    public int Front() {
        return (isEmpty())?-1:arr[front%k];
    }

    public int Rear() {
        return (isEmpty())?-1:arr[(end-1)%k];
    }

    public boolean isEmpty() {
        return end==front;
    }

    public boolean isFull() {
        return end-front==k;
    }
}
