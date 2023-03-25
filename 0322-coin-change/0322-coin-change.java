class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int amt=1;amt<amount+1;amt++)
        {
           for(int c : coins)
           {
               if (amt-c>=0)
               {
                   dp[amt]=Math.min(dp[amt],1+dp[amt-c]);
               }
           }
        }
        return (dp[amount]==amount+1)? -1 : dp[amount];
    }
}