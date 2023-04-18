class Solution {
    public int minDistance(String str1, String str2) {
        int l1=str1.length(), l2=str2.length();
	    int[][] dp=new int[l1+1][l2+1];
	    for(int i=1;i<=str1.length();i++)
	    {
	        for(int j=1;j<=str2.length();j++)
	        {
	            if(str1.charAt(i-1)==str2.charAt(j-1))
	                dp[i][j]=dp[i-1][j-1]+1;
	            else
	                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    
	    return (l1-dp[l1][l2])+(l2-dp[l1][l2]);
    }
}