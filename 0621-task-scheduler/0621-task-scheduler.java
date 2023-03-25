class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Character,Integer> m = new HashMap<>();
        Deque<Integer[]> q = new ArrayDeque<>(); 
        int timeTaken=0;
        for(Character c : tasks)
        {
            m.merge(c,1,Integer::sum);
        }
        for(int i: m.values())
        {
            pq.add(i);
        }
        while(pq.peek()!=null || q.peek()!=null)
        {
            timeTaken+=1;
            if (pq.peek()!=null)
            {
                int temp=pq.poll()-1;
                if(temp>0)
                    q.add(new Integer[]{timeTaken+n,temp});
            }
            
            if(q.peek()!=null && q.peek()[0]==timeTaken)
            {
                    pq.add(q.poll()[1]);
            }
        }
        return timeTaken;
    }
}