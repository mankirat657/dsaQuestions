class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            while(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(left));
                left++;
            }
            map.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i - left + 1);
        }
        return maxLen;
    }
}