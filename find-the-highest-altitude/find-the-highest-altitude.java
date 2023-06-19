class Solution {
    public int largestAltitude(int[] gain) {
        int totalAltitude=0;
        int result=0;
        for(int i=0;i<gain.length;i++)
        {
            totalAltitude+=gain[i];
            result=Math.max(totalAltitude,result);
        }
        
        return result;
    }
}