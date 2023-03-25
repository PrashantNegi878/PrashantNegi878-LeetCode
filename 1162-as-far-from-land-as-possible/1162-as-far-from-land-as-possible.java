class Solution {
    public int maxDistance(int[][] grid) {
        Deque<Integer[]> q = new ArrayDeque<>();
        int level=-1,l=grid.length;
        Integer[][] directions=new Integer[][]{new Integer[]{1,0},{0,1},{-1,0},{0,-1}};

        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                if(grid[i][j]==1)
                    q.add(new Integer[]{i,j});
        }

        if(q.size()==0 || q.size()==l*l)
            return -1;
        
        while(q.size()>0)
        {
            int qSize=q.size();
            while(qSize-- >0)
            {
                Integer temp[]=q.poll();
                for(int i=0;i<4;i++)
                {
                    int r=temp[0]+directions[i][0];
                    int c=temp[1]+directions[i][1];

                    if(r<0 || r>=l || c<0 || c>=l || grid[r][c]==1)
                        continue;

                    q.add(new Integer[]{r,c});
                    grid[r][c]=1;
                }
            }
            level+=1;
        }
        return level;
    }
}