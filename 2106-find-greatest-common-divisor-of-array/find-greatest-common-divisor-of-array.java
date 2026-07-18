class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            a = Math.min(a,nums[i]);
            b = Math.max(b,nums[i]);
        }
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}