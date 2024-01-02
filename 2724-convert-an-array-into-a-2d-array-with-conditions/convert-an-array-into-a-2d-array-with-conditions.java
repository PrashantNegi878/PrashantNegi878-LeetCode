class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int[] map = new int[201];
        for(int i:nums)
        {
            if(map[i]>=result.size())
                result.add(new ArrayList<>());
            result.get(map[i]).add(i);
            map[i]++;
        }
        return result;
    }
}