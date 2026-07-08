class Solution {

    static final long mod = 1000000007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        long[] presum = new long[n + 1];
        long[] conval = new long[n + 1];
        int[] count = new int[n + 1];
        long[] pow10 = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int num = s.charAt(i - 1) - '0';

            presum[i] = presum[i - 1] + num;

            if (num == 0) {
                conval[i] = conval[i - 1];
                count[i] = count[i - 1];
            } else {
                conval[i] = (conval[i - 1] * 10 + num) % mod;
                count[i] = count[i - 1] + 1;
            }
        }

        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % mod;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            long sum = presum[right + 1] - presum[left];

            long leftPart = conval[left];
            long rightPart = conval[right + 1];

            int diff = count[right + 1] - count[left];

            long range = (rightPart - (leftPart * pow10[diff]) % mod + mod) % mod;

            ans[i] = (int) ((range * (sum % mod)) % mod);
        }

        return ans;
    }
}