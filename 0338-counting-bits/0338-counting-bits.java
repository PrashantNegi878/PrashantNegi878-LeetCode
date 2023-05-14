class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            result[i]=findOnes(i);
        }
        return result;
    }

    public int findOnes(int i)
    {
        int one=0;
        while(i>0)
            {
                one+=i%2;
                i=i/2;
            }
        return one;
    }
}