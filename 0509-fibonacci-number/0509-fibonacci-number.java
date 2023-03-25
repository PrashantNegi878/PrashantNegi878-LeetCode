class Solution {
    public int fib(int n) {
        if (n<=0)
            return 0;
        else if (n==1 || n==2)
            return 1;
        int curr=1,prev=1,next=0;
        for(int i=2;i<n-1;i++)
        {
            next=curr+prev;
            prev=curr;
            curr=next;
        }
        return curr+prev;
    }
}