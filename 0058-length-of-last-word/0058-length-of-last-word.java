class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength=0;
        boolean temp=false;
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(temp) return wordLength;
            } 
            else
            {
                wordLength++;
                temp=true;
            }
        }

        return wordLength;
    }
}