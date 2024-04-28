import java.util.Arrays;

public class Partition_List {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

        public ListNode partition(ListNode head, int x) {
            ListNode smallerNode = new ListNode(-1);
            ListNode smaller = smallerNode;


            ListNode geraternode = new ListNode(-1);
            ListNode gerater= geraternode;

            ListNode curr=head;
            while(curr!=null){
                if(curr.val<x){
                    smaller.next = curr;
                    smaller =smaller.next;
                }
                else {
                    gerater.next = curr;
                    gerater =gerater.next;
                }
                curr=curr.next;
            }


            smaller.next = geraternode.next;
            gerater.next = null;
            return smallerNode.next;

        }



   //----------------------------TIME LIMIT EXCEEDED ---------------------------
    public ListNode partition1(ListNode head, int x) {
        if (head == null){
            return null;
        }

        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode less = head;
        ListNode greater = head;

        while (head.next != null){
            if (head.val < x){
                // Add node to the less-than list
                less.next = head;
                less = less.next;
            }else {
                greater.next = head;
                greater = greater.next;

            }
            // Move to the next node
            head = head.next;
        }
        // End the greater list
        greater.next = null;
        // Combine the two lists
        less.next = greaterHead.next;

        return lessHead.next;
    }
}
