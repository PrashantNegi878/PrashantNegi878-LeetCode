class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int total=0;
        int l=time.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<l;i++){
            time[i]%=60;
            m.put(time[i],m.getOrDefault(time[i],0)+1);
        }
        m.put(30,m.getOrDefault(30,1)-1);
        m.put(0,m.getOrDefault(0,1)-1);
        for(int i=0;i<l;i++){
            if(m.containsKey((60-time[i]) % 60))
            {
                total+=m.get((60-time[i]) % 60);
                m.put(time[i], m.get(time[i]) - 1);
            } 
        }
        return total;
    }
}