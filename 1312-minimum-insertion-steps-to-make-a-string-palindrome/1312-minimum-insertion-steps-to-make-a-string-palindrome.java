class Solution {
    public int minInsertions(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int l=s.length();
        int[][] dp = new int[l+1][l+1];

        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return l-dp[l][l];
    }
}