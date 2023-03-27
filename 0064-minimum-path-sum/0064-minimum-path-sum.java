class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        int l=grid.length;
        int w=grid[0].length;
        dp=new int[l][w];
        return findMinPathSum(grid,l-1,w-1);
    }

    public int findMinPathSum(int[][] grid, int i, int j) {
        if(i==0 && j==0)  return grid[i][j];
        if(j<0) return Integer.MAX_VALUE;
        if(i<0) return Integer.MAX_VALUE;
        if (dp[i][j]!=0)    return dp[i][j];
        dp[i][j]=(Math.min(findMinPathSum(grid, i, j-1),
                        findMinPathSum(grid, i-1, j)))+grid[i][j];
        return dp[i][j]; 
    }
}