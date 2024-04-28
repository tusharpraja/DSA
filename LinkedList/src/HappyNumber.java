public class HappyNumber {

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = FindSeq(slow);
            fast = FindSeq(FindSeq(fast));
        }while (slow != fast);

        if (slow == 1){
            return true;
        }

        return false;
    }

    private int FindSeq(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }
}
