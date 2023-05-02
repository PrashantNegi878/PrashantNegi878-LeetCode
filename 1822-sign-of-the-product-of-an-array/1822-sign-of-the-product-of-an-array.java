class Solution {
    public int arraySign(int[] nums) {
        boolean result=true;
        for(int i : nums)
            if(i==0)    return 0;
            else if(i<0)  result=!result;  
        if(result)  return 1;
        return -1;
    }
}