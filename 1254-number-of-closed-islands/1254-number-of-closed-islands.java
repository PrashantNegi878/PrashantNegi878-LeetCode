class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               if (grid[i][j]==0)
               {
                   count+=dfs(grid, i, j);
                   count+=1;
               }  
            }
        }
        return count;
    }

    public int dfs(int[][] grid, int i, int j) {
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0)
            return -1;
        if(grid[i][j]!=0)
            return 0;
        grid[i][j]=2;
        return Math.min(
            Math.min(dfs(grid,i+1,j),dfs(grid,i-1,j)),
            Math.min(dfs(grid,i,j+1),dfs(grid,i,j-1)));
    }
}