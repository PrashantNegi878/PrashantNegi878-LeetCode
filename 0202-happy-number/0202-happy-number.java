class Solution {
    HashSet<Integer> hs = new HashSet<Integer>();
    public boolean isHappy(int n) {
        int sum=0;
        int m=0;
        while (n>0)
        {
            m=n%10;
            n=n/10;
            sum+=m*m;
        }
        if(sum==1)
            return true;
        else if(hs.contains(sum))
            return false;
        hs.add(sum);
        return(isHappy(sum)); 
    }
}