public class LinkedList_ImplimentUsingQueue {
    public  static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if (size == 0){
                head = tail = temp;
            }else {
               tail.next = temp;
               tail = temp;
            }
            size++;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.println(temp.val +" ");
                temp = temp.next;
            }
        }

        public boolean isEmpty(){
            if (size == 0){
                return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {
        queueLL q1 = new queueLL();
     ///   q1.display();
        q1.add(2);
        q1.add(3);
        q1.remove();
        q1.display();
    }
}
