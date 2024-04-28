public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void InsertLast(int val){
        if (tail == null){
            InsertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void InsertPI(int val, int index){
        if (index == 0){
            InsertFirst(val);
            return;
        }
        if (index == size){
            InsertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int DeleteLast(){
        if (size <= 1){
            return DeleteFirst();
        }

        Node SecondLast = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int DeletePI(int index){
        if (size == 0){
            return DeleteFirst();
        }

        if (index == size-1){
            return DeleteLast();
        }

        Node pev = get(index-1);
        int val = pev.next.value;
        pev.next = pev.next.next;
        size--;
        return val;
    }

    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    //Insert Using Recursion

    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val,index--,node.next);
        return node;
    }


    //Recusion reverse

    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }
        
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
}
