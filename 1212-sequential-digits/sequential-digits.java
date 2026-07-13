class Solution {
   
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String Digits = "123456789";
        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();
       
        for(int i = minLen; i <=maxLen; i++){
            for(int j = 0; j <= 9 - i; j++){
                String sub = Digits.substring(j,j+i);
                int num = Integer.parseInt(sub);

                if(num >= low && num <=high) res.add(num);
            }
        }
        return res;
    }
}