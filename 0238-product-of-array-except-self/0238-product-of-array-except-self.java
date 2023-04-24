class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] pref=new int[l];
        int[] suf=new int[l];

        int currSum=1;
        for(int i=0;i<l;i++)
        {
            currSum=currSum*nums[i];
            pref[i]=currSum;
        }
        currSum=1;
        for(int i=l-1;i>=0;i--)
        {
            currSum=currSum*nums[i];
            suf[i]=currSum;
        }
        nums[0]=suf[1];
        nums[l-1]=pref[l-2];

        for(int i=1;i<l-1;i++)
        {
            nums[i]=pref[i-1]*suf[i+1];
        }

        return nums;
    }
}