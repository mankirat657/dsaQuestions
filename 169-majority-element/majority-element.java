class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int no = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                no = nums[i];
                count =1;
            }else if(nums[i] == no) count+=1;
            else{
                count-=1;
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == no) cnt++;
        }
        if(cnt > n/2) return no;
        else return -1;
    }
}