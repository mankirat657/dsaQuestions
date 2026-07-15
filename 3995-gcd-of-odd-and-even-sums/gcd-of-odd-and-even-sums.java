class Solution {
    public static int GCD(int first,int second){
        if(first == 0 || second == 0) return Math.max(first,second);

        int result = Math.min(first,second);

        while(result > 0){
            if(first % result == 0 && second % result == 0){
                break;
            }
            result--;
        }

        return result;
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int count = 0;
        for(int i = 2; count < n ; i+=2){
            evenSum += i;
            count+=1;
        }
        count = 0;
        for(int i = 1; count < n; i+=2){
            oddSum +=i;
            count+=1;
        }
        return GCD(oddSum,evenSum);
    }
}