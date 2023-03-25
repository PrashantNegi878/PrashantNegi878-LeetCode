class Solution {
    int[] char_map = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<26;i++)
        {
            char_map[order.charAt(i)-'a']=i;
        }

        for(int i=1;i<words.length;i++)
        {
            if(compare(words[i],words[i-1])<0)
                return false;
        }
        return true;
    }

    public int compare(String w1, String w2)
    {
        int i=0,j=0,comp_value=0;
        while(i<w1.length() && j<w2.length() && comp_value==0)
        {
            comp_value=char_map[w1.charAt(i)-'a']-char_map[w2.charAt(i)-'a'];
            i++;
            j++;
        }
        if(comp_value==0)
            return w1.length()-w2.length();
        return comp_value;
    }
}