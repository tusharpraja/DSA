public class Time_Needed_to_Buy_Tickets {

    /*Approach
1. Initialize a variable time to keep track of the total time taken.
2. While the person at position k hasn't bought all their tickets:
Iterate through the queue and let each person buy a ticket.
Update the queue by decrementing the number of tickets for the person who bought a ticket.
Increment the time by 1 second for each pass.
3. Return the total time taken.*/

    public static void main(String[] args) {
        int arr[] = {2,3,2};
        int k = 2;
        int ans = timeRequiredToBuy(arr,k);
        System.out.println(ans);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }
}


/*Example 1:

Input: tickets = [2,3,2], k = 2
Output: 6
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
Example 2:

Input: tickets = [5,1,1,1], k = 0
Output: 8
Explanation:
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.*/
