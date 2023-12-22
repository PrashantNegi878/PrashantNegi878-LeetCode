class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int a,b;
        int l=nums.length;
        int result=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<l-2;i++)
        {
            a=i+1;
            b=l-1;
            int sum;
            while(a<b)
            {
                sum=nums[i]+nums[a]+nums[b];
                result=Math.abs(target-sum)<Math.abs(target-result)?sum:result;
                if(result==target) return target;
                if(sum<target)a++;
                else b--;
            }
        }
        return result;
    }
}