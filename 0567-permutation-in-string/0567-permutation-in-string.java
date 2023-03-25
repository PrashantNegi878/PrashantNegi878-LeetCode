class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] map = new char[26];
        char[] tempmap=new char[26]; 
        int l1=s1.length();
        int l2=s2.length();
        if (l1>l2)
            return false;
        for(int i=0;i<l1;i++)
            map[s1.charAt(i)-'a']+=1;
        for(int i=0;i<l2;i++)
        {
            map[s2.charAt(i)-'a']-=1;
            if(i-l1>=0)
                map[s2.charAt(i-l1)-'a']+=1;
            if(checkIfAllZero(map))
                return true;
        }
        return false;
    }

    public boolean checkIfAllZero(char[] map)
    {
        for(int i=0;i<26;i++)
        {
            if(map[i]!=0)
                return false;
        }
        return true;
    }
}