class Solution {
    public int maxProduct(int[] nums) {
        int maxPLeft = Integer.MIN_VALUE;
        int maxPRight = Integer.MIN_VALUE;
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            prod *= nums[i];

            maxPLeft = Math.max(maxPLeft,prod);

            if(prod == 0) prod = 1;
        }
        prod = 1;
        for(int i = nums.length-1; i >= 0; i--){
            prod *= nums[i];

            maxPRight = Math.max(maxPRight,prod);

            if(prod == 0) prod = 1;
        }
        return Math.max(maxPLeft,maxPRight);
    }
}