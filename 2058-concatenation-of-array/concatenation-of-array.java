class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] newArr = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[i];
        }
        int i = 0;
        while(newArr[i] != 0){
            i++;
        }
        for(int j = i; j < newArr.length; j++){
            newArr[j] = nums[j-nums.length];
        }
        return newArr;
    }
}