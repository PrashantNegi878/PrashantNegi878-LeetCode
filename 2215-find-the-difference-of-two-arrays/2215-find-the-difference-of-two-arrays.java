class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        for(int i: nums2) s.add(i);

        for(int i: nums1)
            if(!s.contains(i))
            {
                l.add(i);
                s.add(i);
            }
        
        result.add(l);
        s.clear();
        l = new ArrayList<>();

        for(int i: nums1) s.add(i);

        for(int i: nums2)
            if(!s.contains(i))
            {
                l.add(i);
                s.add(i);
            } 
                
        result.add(l);

        return result;

    }
}