class Solution {
    public long mostPoints(int[][] questions) {
        int l=questions.length;
        long[] dp  = new long[l+1];
        for(int i=l-1;i>=0;i--)
        {
            if((i+questions[i][1]+1)<l)
                dp[i]=dp[i+questions[i][1]+1]+questions[i][0];
            else
                dp[i]=questions[i][0];
            long temp=dp[i+1];
            dp[i]=Math.max(dp[i],temp);
        }
        return dp[0];
    }
}