class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total=0,current=0;
        for(int i : nums)
        {
            if(i==0)
            {
                current+=1;
                total+=current;
            }
            else current=0;
        }
        return total;
    }
}