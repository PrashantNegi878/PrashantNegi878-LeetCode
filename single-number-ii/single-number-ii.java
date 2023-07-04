class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int result=0;
        Deque<Integer> q = new ArrayDeque<>();

        for(int i: nums)
        {
            hm.merge(i,1,Integer::sum);
            result+=i;
            if(hm.get(i)==3)result-=3*i;
        }
        return result;
    }
}