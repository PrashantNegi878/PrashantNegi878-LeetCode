class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int l1=str1.length(), l2=str2.length();
        int[][] dp = new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        StringBuilder result=new StringBuilder();

        int i=l1,j=l2;
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                result.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else
            {
                if(dp[i-1][j]>dp[i][j-1])
                {
                    result.append(str1.charAt(i-1)); 
                    i--;
                }
                else
                {
                    result.append(str2.charAt(j-1)); 
                    j--;
                }   
            }
        }

        while(i>0){ result.append(str1.charAt(i-1));i--;}
        while(j>0){ result.append(str2.charAt(j-1));j--;}

        return result.reverse().toString();
    }
}