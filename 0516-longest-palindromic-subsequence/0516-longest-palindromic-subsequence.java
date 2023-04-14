class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        int l=s.length();
        dp=new int[l+1][l+1];
        for(int[] i : dp)
            Arrays.fill(i,-1);
        StringBuilder s2= new StringBuilder();
        s2.append(s);
        s2.reverse();
        return findLongestPalindromeSubseq(s,s2.toString(),l-1,l-1);
    }

    public int findLongestPalindromeSubseq(String s1, String s2,int l1,int l2)
    {
        if(l1<0 || l2<0)
            return 0;

        if(dp[l1][l2]!=-1)
            return dp[l1][l2];

        if(s1.charAt(l1)==s2.charAt(l2))
            return dp[l1][l2]=1+findLongestPalindromeSubseq(s1,s2,l1-1,l2-1);
        else
            return dp[l1][l2]=Math.max
            (findLongestPalindromeSubseq(s1,s2,l1-1,l2),
            findLongestPalindromeSubseq(s1,s2,l1,l2-1));
    } 
}