import java.util.Stack;

public class Min_Stack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();   //extra stack 0(n)
    public void MinStack() {

    }

    public void push(int val) {
        if(st.size() == 0){   // agar dono me zero hai toh dono me push kar do
            st.push(val);
            min.push(val);
        }else{
            st.push(val);
            if(min.peek() < val){        // agar jo value top me hai wo mn se choti hai toh dono me push kar do nhi hai toh
                                         // min stack wali minValue ko hi dubara push kar do min me
                min.push(min.peek());
            }else{
                min.push(val);
            }
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
