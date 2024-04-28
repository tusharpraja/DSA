public class buyAndSellStock2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = buyAndSellStock(arr,0);
        int ans1 = buyAndSellStock2(arr);
        System.out.println(ans);
        System.out.println(ans1);
    }

    //0(N^2)
    public static int buyAndSellStock(int[] prices, int s){
        if (s >= prices.length){
            return 0;
        }

        int max = 0;
        for (int i = s; i < prices.length; i++) {
            int maxProfit = 0;
            for (int j = i+1; j <prices.length ; j++) {
                if (prices[i] < prices[j]){
                    int profit = buyAndSellStock(prices,i+1) + prices[j] - prices[i];

                    if (profit > maxProfit){
                         maxProfit = profit;
                    }
                }

                if (maxProfit > max){
                    max = maxProfit;
                }

            }
        }

        return max;
    }


    //0(N)
    public static int buyAndSellStock2(int[] prices){
      int diff = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]){
                diff = diff + prices[i] - prices[i-1];
            }
        }

        return diff;
    }
}
