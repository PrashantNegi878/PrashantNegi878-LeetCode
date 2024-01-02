class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int[] counter = new int[201];
        List<Integer> li = new ArrayList<>();
        int max = 0;
        for(int i : nums){
            if(counter[i] >= result.size()){
                result.add(new ArrayList<>());
            }
            result.get(counter[i]).add(i);
            counter[i]++;
        }
        return result;
    }
}