class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int l=s.length();
        Set<Character> hs = new HashSet<>();
        int res=0;
        for(int b=0;b<l;b++)
        {
            while(hs.contains(s.charAt(b)))
            {
                hs.remove(s.charAt(a));
                a+=1;
            }
            hs.add(s.charAt(b));
            res=Math.max(res,b-a+1);
        }
        return res;
    }
}