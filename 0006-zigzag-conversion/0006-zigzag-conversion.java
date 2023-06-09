class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int l=s.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            int increment=(numRows-1)*2;
            for(int j=i;j<l;j+=increment)
            {
                result.append(s.charAt(j));
                if(i>0 && i<numRows-1 && j+increment-2*i<l)
                result.append(s.charAt(j+increment-2*i));
            }
        }
        return result.toString();
    }
}