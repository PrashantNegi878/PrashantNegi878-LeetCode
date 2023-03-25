class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> maxHeap = new TreeSet<>();
        for (int x : nums)
            if (x%2 == 0)
                maxHeap.add(x);
            else
                maxHeap.add(x*2);
        int ans = Integer.MAX_VALUE;
        while (true) {
            int val = maxHeap.last();
            ans = Math.min(ans, val - maxHeap.first());
            if (val%2 == 0) {
                maxHeap.remove(val);
                maxHeap.add(val/2);
            } else
                break;
        }
        return ans;
    }
}