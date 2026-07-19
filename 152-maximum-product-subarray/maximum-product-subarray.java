class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int n = nums.length;
        int maxP = Integer.MIN_VALUE;
        int maxP2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){ // i = 0;
           prod *= nums[i];

           maxP = Math.max(maxP,prod);

           if(prod == 0) prod = 1;
        }
        prod = 1;
        for(int i = n-1; i >=0; i--){ // i = 0;
           prod *= nums[i];

           maxP2 = Math.max(maxP2,prod);

           if(prod == 0) prod = 1;
        }
        return Math.max(maxP,maxP2);
    }
}