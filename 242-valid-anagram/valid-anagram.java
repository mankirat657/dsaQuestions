class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        Arrays.sort(char1);
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        String sorted1 = new String(char1);
        String sorted2 = new String(char2);


        if(sorted1.equals(sorted2)) return true;
        else return false;
    }
}