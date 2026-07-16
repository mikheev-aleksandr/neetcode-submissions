class Solution {
    public int maxProfit(int[] prices) {
      var sellIndex = prices.length - 1;
      var buyIndex = prices.length - 2;
      var potentialSell = prices[sellIndex];
      var potentialSellIndex = sellIndex;
      var profit = 0;
      for (int i = prices.length - 2; i >= 0; i--)  {
         if (prices[i] > potentialSell) {
            potentialSell = prices[i];
            potentialSellIndex = i;
         }
         if (potentialSell - prices[i] > profit && potentialSellIndex > i) {
            buyIndex = i;
            sellIndex = potentialSellIndex;
            profit = potentialSell - prices[i];
         }
      }
      return profit;
    }
}
