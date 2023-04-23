class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++)
        {
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                    s.add(List.of(nums[i],nums[j++],nums[k--]));
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        return new ArrayList(s);
    }
}