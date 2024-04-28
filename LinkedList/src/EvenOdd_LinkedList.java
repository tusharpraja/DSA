public class EvenOdd_LinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Input: head = [1,2,3,4,5]
    //Output: [1,3,5,2,4]

    //Input: head = [2,1,3,5,6,4,7]
    //Output: [2,3,6,7,1,5,4]

 public ListNode oddEvenList(ListNode head){
     if (head == null){
      return head;
     }

  ListNode odd = head;
  ListNode even = head.next;

  //Maintain the even head
  ListNode evenHead = even;

  while (even != null  && even.next != null){

   //Change pointer for Odd list
   odd.next = odd.next.next;
   odd = odd.next;

   //Change pointer for even list
   even.next = even.next.next;
   even = even.next;
  }

  //Assign even list at the end of odd list
  odd.next = evenHead;

  return head;

 }
}
