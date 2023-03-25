class Solution {
    public int rob(int[] nums) {
        int l=nums.length;
        if (l==0) return 0;
        if (l>1) nums[1] =Math.max(nums[0],nums[1]);
        for(int i=2;i<l;i++)
        {
            nums[i]=Math.max(nums[i]+nums[i-2],nums[i-1]);
        }
        return nums[l-1];
    }
}