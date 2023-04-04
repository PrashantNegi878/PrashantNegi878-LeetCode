//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        int l=N;
        int w=sum;
        long[][] dp = new long[l+1][w+1];
        
        for(int j=0;j<=w;j++) dp[0][j]=0;
        for(int i=0;i<=l;i++) dp[i][0]=1;
        
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j]=(long)dp[i][j-coins[i-1]]+dp[i-1][j];
                else
                    dp[i][j]=(long)dp[i-1][j];
            }
        }
        return dp[l][w];
    }
}