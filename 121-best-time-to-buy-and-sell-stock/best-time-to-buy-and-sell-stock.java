class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
           if(prices[i] < small){
            small = prices[i];
           }else{
            maxProfit = Math.max(maxProfit,prices[i] - small);
           }
        }
        return maxProfit;
    }
}