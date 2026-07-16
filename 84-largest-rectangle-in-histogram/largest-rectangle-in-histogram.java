class Solution {
    public int largestRectangleArea(int[] heights) {
        //6, 2, 5, 4, 5, 1, 6
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<Integer>();
        int el = 0;
        int nse = 0;
        int pse =0;
        for(int i  = 0; i < n;i++){
           while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                el = st.peek();
                st.pop();
                nse = i;
                pse = st.isEmpty() ? -1: st.peek();
                maxArea = Math.max(heights[el] * (nse - pse - 1),maxArea);
           }
           st.push(i);
          }
        while(!st.isEmpty()){
            nse = n;
            el = st.peek();
            st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(heights[el] * (nse - pse - 1),maxArea);
        }

        return maxArea;
    }
}