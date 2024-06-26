public class Swap_Nodes_in_Pairs {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Input: head = [1,2,3,4]
    //Output: [2,1,4,3]

  public ListNode swapPairs(ListNode head){
      if (head == null || head.next == null){
          return head;
      }

      ListNode n = head.next;
      head.next = swapPairs(head.next.next);
      n.next = head;
      return n;
  }
}
