class Solution {
    int[][]dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return findSubSequence(text1,text2,text1.length(),text2.length());
    }

    public int findSubSequence(String text1, String text2, int a, int b)
    {
        if(a<=0 || b<=0)
            return 0;
        if(dp[a][b]!=-1)
            return dp[a][b];
        if(text1.charAt(a-1)==text2.charAt(b-1))
            return dp[a][b]=1+findSubSequence(text1,text2,a-1,b-1);
        else
            return dp[a][b]=Math.max(findSubSequence(text1,text2,a-1,b),
                                    findSubSequence(text1,text2,a,b-1));
    }
}