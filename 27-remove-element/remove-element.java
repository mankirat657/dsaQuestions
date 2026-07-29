class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int k = 0;
        int i = 0,
            j = 1;
        
        while(j < nums.length){
            if(nums[i] == val){
                if(nums[j] != val){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
        for(int c = 0; c < nums.length; c++){
            if(nums[c] == val) k++;
        }
        return nums.length - k;
    }
}