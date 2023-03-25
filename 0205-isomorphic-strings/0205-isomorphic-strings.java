class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map m = new HashMap();
        Set<Character> ss = new HashSet<Character> ();
        Set<Character> ts = new HashSet<Character> ();
        String strs="";
        if(s.length()==t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                ss.add(s.charAt(i));
                ts.add(t.charAt(i));
            }
            if(ss.size()==ts.size())
            {
            for(int i=0;i<s.length();i++)
            {
                if(!m.containsKey(t.charAt(i)))
                    {
                        m.put(t.charAt(i),s.charAt(i));
                    }
            }
            for(int i=0;i<s.length();i++)
            {
                strs=strs+m.get(t.charAt(i));
            }
            System.out.print(strs);
            // System.out.print(ts);
            if(strs.equals(s)) return true;
            return false;
            }
        }
        return false;
    }
}