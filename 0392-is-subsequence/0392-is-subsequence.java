class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] temp=s.toCharArray();
        String ss="";
        int ps=0,pt=0;
        while(ps<s.length() && pt<t.length())
        {
            if(s.charAt(ps)==t.charAt(pt))
            {
                ss+=t.charAt(pt);
                ps++;
            }
            pt++;
        }
        System.out.println(ss);
        if(s.equals(ss))return true;
        return false;

    }
}