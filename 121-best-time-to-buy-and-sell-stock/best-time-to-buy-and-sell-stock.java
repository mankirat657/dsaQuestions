class Solution {
    public int maxProfit(int[] prices) {
        int maxi = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < maxi){
                maxi = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-maxi);
            }
        }

        return maxProfit;
    }
}