class Solution {
    int[] hs = new int[128];

    public int maxVowels(String s, int k) {
        hs['a']=1;
        hs['e']=1;
        hs['i']=1;
        hs['o']=1;
        hs['u']=1;
        int l=s.length();
        int max=countVowels(s,0,k-1);
        int tempMax=max;
        for(int i=1;i<=l-k;i++)
        {
            tempMax=tempMax-hs[s.charAt(i-1)]+hs[s.charAt(i+k-1)];
            max=Math.max(max,tempMax);
        }
        return max;
    }

    public int countVowels(String s, int i, int j)
    {
        int total=0;
        for(int z=i;z<=j;z++)
        {
            total+=hs[s.charAt(z)];
        }
        return total;
    }
}