class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if(nums.length==0)  return result;
        int start=0;
        int end=0;


        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
                end=i;
            else
            {
                if(start==end)
                    result.add(Integer.toString(nums[start]));
                else
                    result.add(Integer.toString(nums[start])+"->"+Integer.toString(nums[end]));
                start=i;
                end=i;
            }
        }
        if(start>=end)
            result.add(Integer.toString(nums[start]));
        else
            result.add(Integer.toString(nums[start])+
            "->"+Integer.toString(nums[end]));
        return result;
    }
}