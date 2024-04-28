public class Remove_Duplicates_from_Sorted_List_II {


    //Input: head = [1,2,3,3,4,4,5]
    //Output: [1,2,5]
    //Input: head = [1,1,1,2,3]
    //Output: [2,3]


/* // Special case...
        if (head == null || head.next == null)
            return head;

        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode curr = fake;

        while(curr.next != null && curr.next.next != null){
            // if the value of curr.next and curr.next.next is same...
            // There is a duplicate value present in the list...
            if(curr.next.val == curr.next.next.val) {
                int duplicate = curr.next.val;
                // If the next node of curr is not null and its value is eual to the duplicate value...
                while(curr.next !=null && curr.next.val == duplicate) {
                    // Skip those element and keep updating curr...
                    curr.next = curr.next.next;
                }
            }
            // Otherwise, move curr forward...
            else{
                curr = curr.next;
            }
        }
        return fake.next;       // Return the linked list...*/
}
