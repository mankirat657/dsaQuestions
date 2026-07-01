class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int i = 0,
            j = height.length - 1;
            int count = 0;
        while( i <= j ){
            if(leftMax <= rightMax){
                leftMax = Math.max(leftMax,height[i]);
                count += leftMax - height[i];
                i++;
            }else if(rightMax <= leftMax){
                rightMax = Math.max(rightMax,height[j]);
                count += rightMax - height[j];
                j--;
            }
        }
        return count;
    }
}