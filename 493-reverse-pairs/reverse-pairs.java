class Solution {
    public static void merge(int[] arr,int low, int mid, int high){
        int[] cpyarr = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
               cpyarr[k++] = arr[left++];
            }else{
               cpyarr[k++] = arr[right++];
              
            }
        }
        while(left <= mid){
             cpyarr[k++] = arr[left++];
        }
        while(right <= high){
             cpyarr[k++] = arr[right++];
        }
        for(int i = low; i <=high; i++){
            arr[i] = cpyarr[i - low];
        }
    }
    static int countPairs(int[]arr,int low,int mid,int high){
        int right = mid + 1;
        int cnt = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && arr[i] > 2L * arr[right])right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    static int mergeSort(int[] arr, int low,int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = low + (high - low) / 2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}