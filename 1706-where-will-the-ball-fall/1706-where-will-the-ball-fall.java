class Solution {
    int l=0;
    int w=0;
    public int[] findBall(int[][] grid) {
        l=grid.length;
        w=grid[0].length;
        int[] b =new int[w];
        for(int i=0;i<w;i++)
        {
            b[i]=dfs(grid,0,i);
        }
        return b;
    }

    public int dfs(int[][] grid,int r,int c)
    {
        if (r>=l)
            return c;
        if(grid[r][c]==1 && c+1<w && grid[r][c+1]==1)
            return dfs(grid,r+1,c+1);
        else if(grid[r][c]==-1 && c-1>=0 && grid[r][c-1]==-1)
            return dfs(grid,r+1,c-1);
        else if(grid[r][c]==1 && c+1==w)
            return -1;
        else
            return -1;
    }
}