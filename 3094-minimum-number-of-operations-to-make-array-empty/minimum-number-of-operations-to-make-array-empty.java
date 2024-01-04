class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>(); 
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        
        for(int value : m.values()){
            while(value>0)
            {
                if(value>=3 && value%3==0)
                {
                    result+=value/3;
                    break;
                } 
                else if(value>=2) value-=2;
                else return -1;
                result++;
            }
        };
        return result;
    }
}