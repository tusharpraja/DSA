import java.util.LinkedList;
import java.util.Queue;

public class Queus {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(8);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }


}
