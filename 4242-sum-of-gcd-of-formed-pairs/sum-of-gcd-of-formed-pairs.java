class Solution {
    public static int GCD(int first,int second){
         while(second != 0){
            int temp = second;
            second = first % second;
            first = temp;
         }   
        return first;
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = nums[0];
        int n = nums.length;
        prefixGcd[0] = GCD(nums[0],max);
        for(int i = 1; i < n; i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = GCD(max, nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i = 0,
            j = n-1;
        long sum = 0;
        while(i < j){
            sum = sum + GCD(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}