class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int maxLen = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int elm = nums[0];
        int len = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == elm) continue;
            if(nums[i] == elm+1){
                len+=1;
            }else{
                maxLen = Math.max(maxLen,len);
                len = 1;
            }
            elm = nums[i];

        }
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}