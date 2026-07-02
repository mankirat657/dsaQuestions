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
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[i].length; j++){
                     int temp = matrix[i][j];
                     matrix[i][j] = matrix[j][i];
                     matrix[j][i] = temp;
             }
        }
        for(int i = 0; i < matrix.length; i++){
            reverseArr(0,matrix[i].length-1,matrix[i]);
        }

    }
}