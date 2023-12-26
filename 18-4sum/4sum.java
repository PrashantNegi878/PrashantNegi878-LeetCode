class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int a,b;
        long total=0;
        int l=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<l-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=l-1;j>i+2;j--)
            {
                if(j<l-1 && nums[j]==nums[j+1]) continue;
                a=i+1;
                b=j-1;
                while(a<b)
                {
                    total=nums[i]+nums[a];
                    total+=nums[b]+nums[j];
                    if(total==target)
                    {
                        result.add(List.of(nums[i],nums[a],nums[b],nums[j]));
                        a++;
                        b--;
                        while(a<b && nums[a]==nums[a-1]) a++;
                        while(a<b && nums[b]==nums[b+1]) b--;
                    } 
                    else if(total<target) a++;
                    else  b--;
                }
            }
        }
        return result;
    }
}