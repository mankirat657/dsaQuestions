class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> {
         if (x[0] == y[0]) {
        return Integer.compare(y[1], x[1]);
        }
         return Integer.compare(x[0], y[0]);
        });
        int removalCount = 0;
        int maxIntervals = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][1] <= maxIntervals){
                removalCount+=1;
            }else{
                maxIntervals = intervals[i][1];
            }
        }


        return intervals.length - removalCount;
    }
}