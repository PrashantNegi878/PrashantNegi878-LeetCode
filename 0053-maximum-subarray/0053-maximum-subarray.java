class Solution {
    public int maxSubArray(int[] nums) {
        int l= nums.length;
        int i=0,j=1;
        int sum=nums[i];
        int max=nums[0];
        while(j<l)
        {
            if(sum<0)
            {
                i=j;
                j=i+1;
                sum=nums[i];
            }
            else
            {
                sum+=nums[j];
                j++;
            }
            max=Math.max(sum,max);
        }

        return max;
    }
}