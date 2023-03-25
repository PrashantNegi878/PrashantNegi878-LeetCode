class Solution {
    int islands=0;
    public int numIslands(char[][] grid) {
        if (grid==null)
            return 0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    bfs(grid,i,j,r,c);
                    islands+=1;
                }
            }
        }
        return islands;
    }

    public void bfs(char[][] grid, int r,int c,int rl,int cl)
    {
        if(r<0 || r>=rl || c<0 || c>=cl || grid[r][c]=='0' || grid[r][c]=='2')
            return;
        grid[r][c]='2';
        bfs(grid,r+1,c,rl,cl);
        bfs(grid,r-1,c,rl,cl);
        bfs(grid,r,c-1,rl,cl);
        bfs(grid,r,c+1,rl,cl);
        return;

    }

}