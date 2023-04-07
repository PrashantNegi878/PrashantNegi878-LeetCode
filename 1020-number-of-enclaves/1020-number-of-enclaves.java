class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {

                    int temp=dfs(grid, i ,j);
                    if (temp>0) count+=temp;
                }
            }
        }
        return count;
    }

    public int dfs(int[][] grid, int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length)
            return -1;
        if(grid[i][j]!=1)
            return 0;
        grid[i][j]=2;
        int a=dfs(grid,i+1,j);
        int b=dfs(grid,i-1,j);
        int c=dfs(grid,i,j+1);
        int d=dfs(grid,i,j-1);

        if (a==-1 || b==-1 || c==-1 || d==-1)
        {
            return -1;
        }
        else
            return a+b+c+d+1;
    }
}