class Solution {
    public int maxProfit(int[] prices) {
      var buyIndex = prices.length - 2;
      var sellIndex = prices.length - 1;
      var profit = 0;
      for (int i = prices.length - 2; i >= 0; i--)  {
         if (prices[i] > prices[sellIndex]) {
            sellIndex = i;
         }
         if (prices[sellIndex] - prices[i] > profit && sellIndex > i) {
            buyIndex = i;
            profit = prices[sellIndex] - prices[i];
         }
      }
      return profit;
    }
}
