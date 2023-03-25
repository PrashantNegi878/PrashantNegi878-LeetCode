class Solution {
    public int climbStairs(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        return febonacciSeries(n);
    }

    public int febonacciSeries(int n) {
        int prev=1,curr=1,next=0;
        for(int i=0;i<n-1;i++)
        {
            next=curr+prev;
            prev=curr;
            curr=next;
        }
        return curr;
    }
}