class Solution {
    Deque<Integer[]> q = new ArrayDeque<Integer[]>();
    int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int l=grid.length,w=grid[0].length;
        int fresh=0,time=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(grid[i][j]==1)
                    fresh+=1;
                else if(grid[i][j]==2)
                    q.add(new Integer[] {i,j});
            }
        }
        while(q.peek()!=null && fresh>0)
        {
            int qs=q.size();
            for(int i=0;i<qs;i++)
            {
                fresh=bfs(grid,l,w,q.peek()[0],q.peek()[1],fresh);
                q.pop();
            }
            time+=1;
        }
        
        if (fresh==0)
            return time;   
        return -1;   
    }

    public int bfs(int[][] grid,int l,int w,int qi,int qj,int fresh) {
        for(int i=0;i<4;i++)
        {
            int icurr=qi+directions[i][0];
            int jcurr=qj+directions[i][1];
            if(icurr>=0 && icurr<l 
            && jcurr>=0 && jcurr<w 
            && grid[icurr][jcurr]!=2
            && grid[icurr][jcurr]!=0)
            {    
                grid[icurr][jcurr]=2;
                q.add(new Integer[]{icurr,jcurr});
                fresh-=1;
            }
        }
        return fresh;
    }
}