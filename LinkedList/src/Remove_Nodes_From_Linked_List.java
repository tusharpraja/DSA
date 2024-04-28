public class Remove_Nodes_From_Linked_List {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Input: head = [5,2,13,3,8]
    //Output: [13,8]
    //Explanation: The nodes that should be removed are 5, 2 and 3.
    //- Node 13 is to the right of node 5.
    //- Node 13 is to the right of node 2.
    //- Node 8 is to the right of node 3.
    //Example 2:
    //
    //Input: head = [1,1,1,1]
    //Output: [1,1,1,1]
    //Explanation: Every node has value 1, so no nodes are removed.

  public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }

        // Reverse the linked list
        head = reverse(head);

        ListNode current = head;
        ListNode maxNode = head;

        while (current != null && current.next != null) {
            if (current.next.val < maxNode.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxNode = current;
            }
        }

        // Reverse the linked list again to get the correct order
        return reverse(head);
    }

    // Helper function to reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
