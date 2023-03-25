class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        for(int[] interval : intervals)
        {
            if(newInterval[0]>interval[1])
                al.add(interval);
            else if(newInterval[1]<interval[0])
            {    
                al.add(newInterval);
                newInterval=interval;
            }
            else
            {
                newInterval[0]=Math.min(newInterval[0],interval[0]);
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
        }
        al.add(newInterval); 
        int[][] res = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }
}