class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int l=0;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
        for(char c: m.keySet())
        {
            if(m.get(c)%2==0)
                l=l+m.get(c);
            else 
                {
                l=l+m.get(c)-1;
                flag=1;
                }
        }
        if(flag==1)
            l=l+1;
        return l;
    }
}