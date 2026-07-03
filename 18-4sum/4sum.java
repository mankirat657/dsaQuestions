class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> outputArray  = new ArrayList<>();

        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0  && nums[i] == nums[i-1]) continue;
            int element1 = nums[i];

            for(int j = i + 1; j < nums.length-2; j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int element2 = nums[j];
                int left = j + 1;
                int right = nums.length - 1;

                while(left < right){
                    long sum = (long)element1 + element2 + nums[left] + nums[right];
                    List<Integer> nl = new ArrayList<>();
                    if(sum == target){
                        nl.add(element1);
                        nl.add(element2);
                        nl.add(nums[left]);
                        nl.add(nums[right]);

                        outputArray.add(nl);

                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                        
                    }
                    else if(sum  < target){
                        left ++;
                    }else{
                        right--;
                    }
                }
            }

        }
        return outputArray;
    }
}