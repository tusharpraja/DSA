public class RemoveDuplication {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /* Input: head = [1,1,2]
      Output: [1,2]
    */

    public ListNode deleteDuplicates(ListNode node) {
        ListNode head = node;
        if (node == null){
            return node;
        }
        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
       return head;
    }
}
