class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int i = 0;i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                int len = 1;
                while(set.contains(curr + 1)){
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}