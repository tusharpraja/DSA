public class Remove_Linked_List_Elements {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Input: head = [1,2,6,3,4,5,6], val = 6
    //Output: [1,2,3,4,5]

    public ListNode removeElements(ListNode head, int val) {
         if (head == null){
             return null;
         }

         while (head != null && head.val == val){
             head = head.next;
         }

        ListNode temp = head;
         while (temp != null  && temp.next != null){
             if (temp.next.val == val){
                 temp.next = temp.next.next;
             }else {
                 temp = temp.next;
             }
         }
         return head;
    }
}
