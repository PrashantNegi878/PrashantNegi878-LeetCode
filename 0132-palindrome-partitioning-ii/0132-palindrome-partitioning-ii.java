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

        if(isPalindrome(s, i,j)) return 0;
        
        int result=Integer.MAX_VALUE;

        for(int k=i;k<j;k++)
        {
            /*An Optimization: We will make the partition only if the string till the partition (till Kth position) is a valid palindrome. Because the question states that all partition must be a valid palindrome. If we dont check this, we will have to perform recursion on the left subproblem too (solve(str, i, k)) and we will waste a lot of time on subproblems that is not required. Without this the code will give correct answer but TLE on big test cases. */
            if(isPalindrome(s, i,k)) 
            result=Math.min(result, 1 + solve(s, k+1, j));
        } 
        return dp[i][j]=result;
    }

    boolean isPalindrome(String str, int start, int end){
    while(start<end){
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
}