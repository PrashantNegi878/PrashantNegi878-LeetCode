class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> m = new HashMap<>();
        StringBuilder s;
        int l=0;
        for(int i=0;i<words.length;i++)
        {
            s= new StringBuilder(words[i]);
            String r=s.reverse().toString();
            if(m.containsKey(r))
            {
                l+=4;
                if(m.get(r)==1)
                    m.remove(r);
                else
                    m.merge(r,-1,Integer::sum);
            }
            else
            {
                m.merge(words[i],1,Integer::sum);
            }
        }
        for(String word : m.keySet())
        {
            if(word.charAt(0)==word.charAt(1))
                return l+2;
        }
        return l;
    }
}