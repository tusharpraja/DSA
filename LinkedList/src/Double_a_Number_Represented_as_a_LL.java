public class Double_a_Number_Represented_as_a_LL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4){
            head  = new ListNode(0,head);
        }

        ListNode temp = head;
        while (temp != null) {
           //Double the value and take module to handle carry
            temp.val = (temp.val*2) % 10;
            //If the next node exits and its value is greter then 4 increment node val
            if (temp.next != null  && temp.next.val > 4){
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }
}
