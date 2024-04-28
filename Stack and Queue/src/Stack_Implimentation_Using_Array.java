public class Stack_Implimentation_Using_Array {
    static class Stack{
        static int[] arr = new int[1000];
        static int top;
        public Stack(){
            top = -1;
        }
        public boolean isEmpty(){
            if(top == -1)
                return true;
            return false;
        }
        public void push(int data){
            if(top < 1000){
                top++;
                arr[top] = data;
            }
        }
        public int pop(){
            if(top == -1){
                return -1;
            }else {
                return arr[top--];
            }
        }
        public int peek(){
            if(top == -1){
                return -1;
            }else {
                return arr[top];
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

