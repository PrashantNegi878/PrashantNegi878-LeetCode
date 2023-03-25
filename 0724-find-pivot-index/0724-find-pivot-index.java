class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,currSum=0;

        for(int i : nums)
            total+=i;

        for(int i=0;i<nums.length;currSum+=nums[i++])
            if(currSum==(total-(nums[i]+currSum)))
                return i;
                
        return -1;

    }
}