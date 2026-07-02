class Solution {
    public int maxSubArray(int[] nums) {
        long sum = 0;
        int left = 0;
        long maxSum  = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum +=nums[i];
            
            maxSum = Math.max(sum,maxSum);

            if(sum < 0){
                sum = 0;
            }
        }
        return (int)maxSum;
    }
}