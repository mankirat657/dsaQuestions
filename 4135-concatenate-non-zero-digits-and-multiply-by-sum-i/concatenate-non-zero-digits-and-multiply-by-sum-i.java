class Solution {
    public long sumAndMultiply(int n) {
        int r = n;
        int sum = 0;
        int newDigits = 0;
        int reversedDigits = 0;
        while(r > 0){
            int lastDigit = r % 10;
            if(lastDigit !=0){
                sum+=lastDigit;
                newDigits = (newDigits * 10) + lastDigit;
            }
            r = r/10;
        }
        while(newDigits > 0){
            int lastDigit = newDigits % 10;
            reversedDigits = (reversedDigits * 10) + lastDigit;
            newDigits = newDigits / 10;
        }
        
        return (long)reversedDigits * sum;
    }
}