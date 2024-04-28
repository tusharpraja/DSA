import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {
    Queue<Integer> q = new LinkedList<>();
    public void MyStack(){

    }

    public void push(int x){
        q.add(x);
        for (int i=0; i<q.size()-1; i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.size() == 0;
    }
}
