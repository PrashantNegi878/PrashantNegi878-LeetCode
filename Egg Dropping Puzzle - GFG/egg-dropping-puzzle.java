//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution {
    public static int [][] t;
    public int eggDrop(int k, int n) {
        t=new int[k+1][n+1];
        for(int [] i:t) Arrays.fill(i,-1);
        return solve(k,n);
    }
    public static int solve(int e,int f){
        if(f==0 || f==1 || e==1) return f;
        if(t[e][f]!=-1) return t[e][f];
        int ans=Integer.MAX_VALUE,l=1,h=f;
		// use binary search insted of linear search
        while(l<=h){
            int mid=(h+l)/2;
            int left=solve(e-1,mid-1);
            int right=solve(e,f-mid);
            int temp=1+Math.max(left,right);
            if(left<right) l=mid+1;
            else h=mid-1;
            ans=Math.min(ans,temp);
        }
        return t[e][f]=ans;
    }
}