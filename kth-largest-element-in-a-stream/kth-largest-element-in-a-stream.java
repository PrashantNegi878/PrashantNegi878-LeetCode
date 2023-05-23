class KthLargest {

    PriorityQueue<Integer> pq;
    int max;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        max=k;

        for(int i: nums)
            pq.offer(i);
    }
    
    public int add(int val) {
        pq.offer(val);

        while(pq.size()>max)
            pq.poll();

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */