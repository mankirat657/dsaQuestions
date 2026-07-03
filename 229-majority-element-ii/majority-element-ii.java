class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int element1 = 0;
        int element2 = 0;
        int count2 =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element1){
                count += 1;
            }else if(nums[i] == element2){
                count2 +=1;
            }else if(count == 0){
                element1 = nums[i];
                count = 1;
            }else if(count2 == 0){
                element2 = nums[i];
                count2 = 1;
            }else{
                count--;
                count2--;
            }
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == element1){
            cnt1 += 1;
           }else if(nums[i] == element2){
            cnt2 += 1;
           }
        }
        if(cnt1 > nums.length / 3){
            result.add(element1);
        }
        if(cnt2 > nums.length / 3){
            result.add(element2);
        }
       
       return result;
    }
}