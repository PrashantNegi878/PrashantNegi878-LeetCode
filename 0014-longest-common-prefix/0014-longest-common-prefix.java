class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        if (l==0)
            return "";
        String pf=strs[0];
        for(int i=1;i<l;i++)
        {
            while(strs[i].indexOf(pf)!=0)
                pf=pf.substring(0,pf.length()-1);
        }
        return pf;
    }
}