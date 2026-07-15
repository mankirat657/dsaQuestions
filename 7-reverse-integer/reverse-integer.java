class Solution {
    public int reverse(int x) {
        boolean negSign = false;
        if(x < 0) negSign = true;
        long reverse = 0;
        String sb = String.valueOf(x).replace("-", "");
        long r = Long.parseLong(sb);
        while(r > 0){
            long last = r % 10;
            reverse = (reverse * 10) + last;
            r = r/10;
        }
        if(negSign){
            reverse = -reverse;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}