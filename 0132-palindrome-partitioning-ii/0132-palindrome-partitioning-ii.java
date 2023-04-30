class Solution {
    int[][] dp;
    public int minCut(String s) {
        int l=s.length();
        dp= new int[l][l];
        for(int[] i : dp) Arrays.fill(i,-1);
        return solve(s,0,l-1);
    }

    public int solve(String s, int i, int j)
    {
        if(i>=j) return 0;
        
        if (dp[i][j]!=-1) return dp[i][j];

        if(isPalindrome(s.substring(i,j+1))) return 0;
        
        int result=Integer.MAX_VALUE;

        for(int k=i;k<j;k++)
        {
            if(isPalindrome(s.substring(i,k+1))) 
            result=Math.min(result, 1 + solve(s, k+1, j));
        } 
        return dp[i][j]=result;
    }

    public boolean isPalindrome(String s)
    {
        if(s.equals(new StringBuilder(s).reverse().toString()))
            return true;   
        return false;
    }
}