class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> hs = new HashMap<>();
        int n=grid.length;
        StringBuilder s ;
        int result=0;

        for(int i=0;i<n;i++)
        {
            s=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                s.append(Integer.toString(grid[i][j])+"-");
            }
            hs.merge(s.toString(),1,Integer::sum);
        }
        
        for(int i=0;i<n;i++)
        {
            s=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                s.append(Integer.toString(grid[j][i])+"-");
            }
            if(hs.containsKey(s.toString()))
                result+=hs.get(s.toString());
        }
        return result;
    }
}