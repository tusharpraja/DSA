import java.util.Stack;

public class Implement_Queue_using_Stacks {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public void MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        if(first.isEmpty()){
            first.push(x);
            return;
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);

        while(!second.isEmpty()){
            first.push(second.pop());
        }

    }

    public int pop() {
        return first.pop();

    }

    public int peek() {
        return first.peek();

    }

    public boolean empty() {
        return first.isEmpty();
    }
}
