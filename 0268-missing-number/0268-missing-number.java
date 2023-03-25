class Solution {
    public int missingNumber(int[] nums) {
        int max=nums.length;
        int sum = (max * (max + 1))/2 ;
        System.out.println(max);

        for(int i: nums)
            sum-=i;

        return sum;
    }
}