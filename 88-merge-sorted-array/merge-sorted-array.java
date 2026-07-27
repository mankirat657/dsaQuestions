class Solution {
    public static void swap(int i, int j, int[]nums1,int[] nums2){
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i  = m-1;
        int j = 0;
        while(i >=0 && j < n){
            if(nums1[i] > nums2[j]){
                swap(i,j,nums1,nums2);
            }else{
                break;
            }
            i--;
            j++;
        }
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2, 0, n);

        for(int k  = 0; k < n;  k++){
            nums1[m + k] = nums2[k];
        }
    }
}