class Solution {
    public int coinChange(int[] coins, int amount) {
        int l=coins.length;
        int w=amount;
        int[][] dp = new int[l+1][w+1];

        for(int j=0;j<=w;j++) dp[0][j]=amount+1;
        // for(int i=0;i<=l;i++) dp[i][0]=true;

        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return (dp[l][w]>amount)? -1:dp[l][w];
    }
}