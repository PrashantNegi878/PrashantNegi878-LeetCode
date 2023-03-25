class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int x=0,y=0;
        for(int stone: stones)
            pq.add(stone);
        while(!pq.isEmpty())
        {
            x=pq.poll();
            if(!pq.isEmpty())
            {
                if(x>pq.peek())
                {
                    pq.add(x-pq.poll());
                }
                else{
                    pq.poll();
                }
            }
            else{
                return x;
            }
        }
        if (pq.peek()==null)
            return 0;
        return pq.poll();
    }
}