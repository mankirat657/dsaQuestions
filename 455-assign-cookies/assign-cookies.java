class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookieCount =0 ;
        while(child < g.length && cookieCount < s.length){
            if(s[cookieCount] >= g[child]) child++;
            cookieCount+=1;
        }
        return child;
    }
}