public class Split_Linked_List_in_Parts {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
    //Output: [[1,2,3,4],[5,6,7],[8,9,10]]
    //Explanation:
    //The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.


    private int size(ListNode curr) {
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        // Calculate the size of the linked list
        int size = size(head);
        // Create an array to store the heads of the resulting linked list parts
        ListNode[] heads = new ListNode[k];
        ListNode curr = head;

        // Calculate the number of nodes to put in each part and the remaining nodes
        int group = size / k;
        int remaining = size % k;

        for (int i = 0; i < k; i++) {
            int put = group;
            // If there are remaining nodes, distribute them among the first parts
            if (remaining > 0) {
                put++;
                remaining--;
            }

            // If the current part is empty, set it to null
            if (curr == null) {
                heads[i] = null;
            } else {
                // Set the head of the current part to the current node
                heads[i] = curr;
                curr = curr.next;
                ListNode prev = heads[i];
                // Traverse the current part and update the pointers
                for (int j = 1; j < put; j++) {
                    prev.next = curr;
                    prev = prev.next;
                    curr = curr.next;
                }
                // Disconnect the current part from the rest of the list
                prev.next = null;
            }
        }
        // Return the array containing the heads of the linked list parts
        return heads;
    }
}

//Approach
//The size method calculates the size of a given linked list by traversing it with a while loop and counting the number of nodes.
//
//In the splitListToParts method, you first calculate the total size of the linked list and create an array heads to store the heads of the resulting linked list parts. curr is initialized to the head of the linked list.
//
//You then calculate the number of nodes to put in each part (group) and the remaining nodes (remaining) that need to be distributed among the first parts.
//
//You loop through each part (represented by i), and for each part, you calculate how many nodes (put) to place in it. If there are remaining nodes, you distribute them to the first parts.
//
//If the current part is empty (i.e., curr is null), you set the corresponding entry in the heads array to null.
//
//Otherwise, if the current part is not empty, you set the head of the current part to curr, and then you traverse the current part with a for loop, updating the pointers as you go. This effectively splits the linked list into parts.
//
//After traversing and updating the current part, you disconnect it from the rest of the list by setting prev.next to null.
//
//Finally, you return the heads array containing the heads of the linked list parts.
//
//Complexity
//Time complexity:
//O(n)
//
//Space complexity:
//O(k) to store k heads in array
