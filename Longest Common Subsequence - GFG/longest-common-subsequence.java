//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    // static int lcs(int x, int y, String s1, String s2)
    // {
    //     // your code here
    // }
    
    
    static int lcs(int x, int y,String text1, String text2) {
        int[][]dp=new int[x+1][y+1];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return findSubSequence(dp,text1,text2,x,y);
    }

    static int findSubSequence(int[][] dp, String text1, String text2, int a, int b)
    {
        if(a<=0 || b<=0)
            return 0;
        if(dp[a][b]!=-1)
            return dp[a][b];
        if(text1.charAt(a-1)==text2.charAt(b-1))
            return dp[a][b]=1+findSubSequence(dp,text1,text2,a-1,b-1);
        else
            return dp[a][b]=Math.max(findSubSequence(dp,text1,text2,a-1,b),
                                    findSubSequence(dp,text1,text2,a,b-1));
    }
    
}