class Solution {

    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE,count =0;
        for (int i: nums)
            min=Math.min(i,min);

        for(int i: nums)
            count+=i-min;

        return count;
    }
}