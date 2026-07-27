class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < n; i++){
           if(intervals[i][0] <= end){
            end = Math.max(end,intervals[i][1]);
           }else{
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            res.add(temp);

            start = intervals[i][0];
            end = intervals[i][1];
           }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        res.add(temp);
        int[][] arr = res.stream()
                 .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
                 .toArray(int[][]::new);

        return arr;
    }
}