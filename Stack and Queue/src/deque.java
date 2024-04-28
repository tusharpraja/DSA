import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        //ADD
        dq.addLast(3);
        dq.addLast(7);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
