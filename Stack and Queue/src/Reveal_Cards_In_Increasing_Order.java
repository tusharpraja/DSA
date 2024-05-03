import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Reveal_Cards_In_Increasing_Order {

    //Time complexity:
    //O(NlogN)
    //Space complexity:
    //O(N)
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> ind = new ArrayDeque<>();
        for (int i = 0; i < deck.length; i++) {
            ind.addLast(i);
        }

        int[] ans = new int[deck.length];
        int i=0;
        while (!ind.isEmpty()){
            ans[ind.pollFirst()] = deck[i];    //first se nikaloo
            if (!ind.isEmpty()){
                ind.addLast(ind.pollFirst());  //last me dalo
            }
            i++;
        }
        return ans;
    }
}
