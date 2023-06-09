class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] ltrArray = new boolean[26];
        int min=Integer.MAX_VALUE;
        for(char c: letters)
        {
            ltrArray[c-'a']= true;
            min=Math.min(min,c-'a');
        }
        
        for(int i=target-'a'+1;i<26;i++)
            if(ltrArray[i]) return (char)('a'+i);

        return (char)('a'+min);
        
    }
}