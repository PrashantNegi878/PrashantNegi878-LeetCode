class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> m = new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> pq 
        = new PriorityQueue<>(new The_Comparator());
        ArrayList<String> result = new ArrayList<>();
        for(String str : words)
            m.merge(str,1,Integer::sum);
        for(Map.Entry s : m.entrySet())
        {
            pq.add(s);
        }
        while(k>0 && pq.peek()!=null)
        {

            result.add(pq.remove().getKey());
            k-=1;
        }
        return result;
    }     
}

class The_Comparator implements Comparator<Map.Entry<String,Integer>> {
    public int compare(Map.Entry<String,Integer> a,Map.Entry<String,Integer> b)
    {
        if(a.getValue()>b.getValue())
            return -1;
        else if(a.getValue()<b.getValue())
            return 1;
        else
            return a.getKey().compareTo(b.getKey());
    }
}

