class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> al = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] newInterval = intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>newInterval[1])
            {
                al.add(newInterval);
                newInterval = intervals[i];
            }
            else 
                newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
        }
        al.add(newInterval);
        return al.toArray(new int[al.size()][2]);
    }
}