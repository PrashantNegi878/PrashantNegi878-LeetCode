class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,res=0,r=0,fmax=0;
        char[] m = new char[26];
        while(r<s.length())
        {
            m[s.charAt(r)-'A']+=1;
            fmax=Math.max(fmax,m[s.charAt(r)-'A']);
            if(r-l+1-fmax>k)
            {
                m[s.charAt(l)-'A']-=1;
                l+=1;
            }
            res=Math.max(r-l+1,res);
            r+=1;
        }
        return res;
    }
}