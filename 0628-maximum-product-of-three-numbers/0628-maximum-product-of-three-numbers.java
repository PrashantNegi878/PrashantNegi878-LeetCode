class Solution {
    public int maximumProduct(int[] nums) {
        int i=0;
        int l=nums.length-1;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[l],
                        nums[l]*nums[l-1]*nums[l-2]);   
    }
}