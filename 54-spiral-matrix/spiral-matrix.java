class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
            spiral.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                spiral.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
    spiral.add(matrix[i][left]);
}
left++;
            }
        }
        return spiral;
        }

    }