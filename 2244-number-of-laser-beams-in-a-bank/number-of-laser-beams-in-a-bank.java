class Solution {
    public int numberOfBeams(String[] bank) {
        long[] lengths = new long[bank.length];
        for(int i=0;i<bank.length;i++)
        {
            lengths[i]=bank[i].chars().filter(ch -> ch == '1').count();
        }
        long lastNonZero=0;
        int result=0;
        for(int i=0;i<bank.length;i++)
        {
            result+=lengths[i]*lastNonZero;
            if (lengths[i]!=0)
                lastNonZero=lengths[i];
        }
        return result;
    }
}