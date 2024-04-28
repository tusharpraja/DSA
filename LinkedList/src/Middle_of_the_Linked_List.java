public class Middle_of_the_Linked_List {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   // Input: head = [1,2,3,4,5]
   // Output: [3,4,5]
   // Explanation: The middle node of the list is node 3.

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return slow;
            }
        }

        return slow;

    }
}
