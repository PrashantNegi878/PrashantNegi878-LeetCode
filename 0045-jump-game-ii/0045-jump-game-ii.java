class Solution {
    public int jump(int[] nums) {
        if (nums.length==1)
            return 0;
        int curr=0,max=0,jumps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(i==curr)
            {
                curr=max;
                jumps+=1;
            }
            if(curr>=nums.length-1)
                return jumps;
        }
        return jumps;
    }
}