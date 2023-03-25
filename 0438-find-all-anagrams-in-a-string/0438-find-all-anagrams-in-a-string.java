class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> res=new ArrayList<>();
        int sl=s.length();
        int pl=p.length();
        for(int i=0;i<pl;i++)
            map[p.charAt(i)-'a']+=1;

        for(int i=0;i<sl;i++)
        {
            map[s.charAt(i)-'a']-=1;
            if(i-pl>=0)
                map[s.charAt(i-pl)-'a']+=1;
            if(checkIfAllZero(map))
                res.add(i-pl+1);
        }
        return res;
    }

    public boolean checkIfAllZero(int[] map)
    {
        for(int i=0;i<26;i++)
        {
            if(map[i]!=0)
                return false;
        }
        return true;
    }
}