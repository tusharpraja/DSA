public class AddTwoNumber {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  /*Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.*/
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode currNode = list;
        int number = 0;

        while (l1 != null || l2 != null || number !=0){
            int sum = 0;
            if (l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            sum = sum + number;
            number = sum/10;
            ListNode node = new ListNode(sum%10);
            currNode.next = node;
            currNode = node;
        }
        return list.next;
    }
}
