class Solution {
    public int maxProfit(int[] prices) {
      var sellPrice = prices[prices.length - 1];
      var profit = 0;
      for (int i = prices.length - 2; i >= 0; i--)  {
         if (prices[i] > sellPrice) {
            sellPrice = prices[i];
         } else {
            profit = profit > (sellPrice - prices[i]) ? profit : (sellPrice - prices[i]);
         }
      }
      return profit;
    }
}
