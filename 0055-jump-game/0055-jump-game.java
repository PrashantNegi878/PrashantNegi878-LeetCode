class Solution {
    public boolean canJump(int[] nums) {
        int maxJump=0;
        int l=nums.length;
        if(l==1)    return true;
        for(int i=0;i<l-1;i++)
        {
            maxJump=Math.max(maxJump,nums[i]);
            if(maxJump==0)  return false;
            maxJump--;
        }
        return true;
    }
}