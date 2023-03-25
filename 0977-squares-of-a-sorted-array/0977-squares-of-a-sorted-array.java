class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int i=0,j=l-1;
        int[] result = new int[l];
        int max=j;

        for(max=j;max>=0;max--)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
                result[max]=nums[i]*nums[i++];
            else
                result[max]=nums[j]*nums[j--];
        }

        return result;
    }
}