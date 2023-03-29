class Solution {
    public boolean canPartition(int[] nums) {
        int sum= Arrays.stream(nums).sum();
        if ((sum%2)==1)   return false;
        else sum=sum/2;
        int l=nums.length;
        boolean[][] dp = new boolean[l+1][sum+1];
        for(int i=0;i<=l;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)  dp[i][j]=false;
                if(j==0)  dp[i][j]=true;
                
                if (i>0)
                if(nums[i-1]<=j)
                {
                    dp[i][j]=(dp[i-1][j-nums[i-1]] || dp[i-1][j]);
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[l][sum];
    }
}