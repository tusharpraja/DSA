public class buyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = buyAndSellStock(arr);
        System.out.println(ans);
    }

    public static int buyAndSellStock(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]){
               int profit = prices[i] - buyPrice;
               maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
