class Solution {
	public String longestPalindrome(String s) {
		int n = s.length();
		int start=0, end=0;
		boolean[][] dp = new boolean[n][n];
		for (int i=n-1;i>=0;i--) {
			for(int j=i; j<n; j++) {
				dp[i][j]=s.charAt(i)==s.charAt(j) && (j-i<2||dp[i+1][j-1]);
				if(dp[i][j]==true && j-i>end-start) {
					start=i;
					end=j;
				}
			}
		}
		return n==0?"":s.substring(start, end+1);
	}
}