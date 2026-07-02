class Solution {
    public static void reverseArr(int left,int right,int[] arr){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void swapArr(int first,int second,int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int rightSidePoint = 0;
        for(int i = nums.length - 2; i >= 0; i--){
          if(nums[i] < nums[i + 1]){
          pivot = i;
          break;
        }
        
        }
            if(pivot == -1){
                 reverseArr(0, nums.length - 1, nums);
                 return;
            }
        for(int i = nums.length - 1; i >pivot ; i--){
            if(nums[i] > nums[pivot]){
                swapArr(i,pivot,nums);
                break;
            }
        }
         

        reverseArr(pivot + 1,nums.length-1,nums);
   
    }
}