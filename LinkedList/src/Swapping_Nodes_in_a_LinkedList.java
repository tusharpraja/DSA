public class Swapping_Nodes_in_a_LinkedList {
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 //Input: head = [1,2,3,4,5], k = 2
    //Output: [1,4,3,2,5]

    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        ListNode first = fast;

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        return head;
    }


}
