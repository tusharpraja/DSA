public class DLL {
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }



    }

    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
       if (head != null){
           head.prev = node;
       }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next  = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public DLL.Node find(int val){
        DLL.Node node = head;
        while (node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertPI(int after, int val){
        Node P = find(after);
        if (P == null){
            System.out.println("does not exits");
            return;
        }

        Node node = new Node(val);
        node.next = P.next;
        P.next = node;
        node.prev = P;
        if (node.next != null){
            node.next.prev = node;
        }
    }
}
