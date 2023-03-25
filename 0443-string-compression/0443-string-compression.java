class Solution {
    public int compress(char[] chars) {
        int i=0,j=0,count=0,l=chars.length;
        if (l==1)
            return 1;
        
        while(i<l)
        {
            count=1;
            while(i<l-1 && chars[i]==chars[i+1])
            {
                count++;
                i++;
            }
                
            chars[j++]=chars[i++];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[j++] = countStr.charAt(k);
                }
            }
        }
        return j;
    }
}