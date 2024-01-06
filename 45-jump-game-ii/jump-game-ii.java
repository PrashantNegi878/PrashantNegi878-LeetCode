class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)  return 0;
        int currMax=nums[0],max=0,result=0;
        for(int i=0;i<nums.length;i++)
        {
            currMax=Math.max(currMax,i+nums[i]);
            if(i==max){
                result++;
                max=currMax;
            } 
            if(max>=nums.length-1) return result;
        }
        return result;
    }
}