class Solution {
    public int numberOfBeams(String[] bank) {
        long currLen;
        long lastNonZero=0;
        int result=0;
        for(int i=0;i<bank.length;i++)
        {
            currLen=bank[i].chars().filter(ch -> ch == '1').count();
            result+=currLen*lastNonZero;
            if (currLen!=0)
                lastNonZero=currLen;
        }
        return result;
    }
}