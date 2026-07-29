class Solution {
    public static void merge(int[] arr, int low,int mid, int high){
        int [] cparr = new int[arr.length];
        int left = low;
        int right = mid +1;
        int k = 0;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                cparr[k++] = arr[left++];
            }else{
                cparr[k++] = arr[right++];
            }
        }
        while(left <= mid) cparr[k++] = arr[left++];
        while(right <= high) cparr[k++] = arr[right++];

        for(int i = low; i <= high; i++){
            arr[i] = cparr[i - low];
        }
    }
    public static void mergeSort(int[] arr,int low, int high){
        if(low >= high) return;

        int mid = low + (high - low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);

        return nums;
    }
}