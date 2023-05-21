class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] nums = new boolean[n];

        Arrays.fill(nums,true);

        for(List<Integer> l: edges)
        {
                nums[l.get(1)]=false;
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++)
            if(nums[i]) result.add(i);
        
        return result;
    }
}