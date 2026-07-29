class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lp = "";
        int n = strs.length;
        if(strs.length == 1) return strs[0];
        for(int i = 1; i < n; i++){
            String prev = strs[i-1];
            String curr = strs[i];
            int j = 0;
            int len = 0;
            if(prev.length() < curr.length()){
                len = prev.length();
            }else len = curr.length();
            while(j < len && prev.charAt(j) == curr.charAt(j)){
                j++;
            }
            if(i==1){
            lp = prev.substring(0,j);
            }else{
                String str = prev.substring(0,j);
                int c = 0;
                int lens = 0;
                if(lp.length() < str.length()){
                lens = lp.length();
                }else lens = str.length();
                while(c < lens && lp.charAt(c) == str.charAt(c)){
                c++;
                }
                lp = lp.substring(0,c);
            }
        }
        return lp;
    }
}