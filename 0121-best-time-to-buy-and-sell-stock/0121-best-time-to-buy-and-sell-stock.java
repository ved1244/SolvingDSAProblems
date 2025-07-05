class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1; i<n;i++){
            int currentProfit = prices[i] - buyPrice;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
            if (prices[i] < buyPrice){
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}