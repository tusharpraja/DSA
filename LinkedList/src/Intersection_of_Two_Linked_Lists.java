public class Intersection_of_Two_Linked_Lists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

  //Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
  //Output: Intersected at '8'

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      while(headB != null){
          ListNode temp = headA;

          while(temp != null){
              if(temp == headB){
                  return headB;
              }

              temp = temp.next;
          }
          headB = headB.next;
      }

      return null;
  }
}
