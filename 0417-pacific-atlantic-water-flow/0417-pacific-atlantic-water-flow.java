class Solution {
    int L;
    int W;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        L=heights.length;
        W=heights[0].length;
        boolean[][] pac = new boolean[L][W];
        boolean[][] atl = new boolean[L][W];

        for(int i=0;i<W;i++)
        {
            dfs(0,i,pac,heights[0][i],heights);
            dfs(L-1,i,atl,heights[L-1][i],heights);
        }

        for(int i=0;i<L;i++)
        {
            dfs(i,0,pac,heights[i][0],heights);
            dfs(i,W-1,atl,heights[i][W-1],heights);
        }

        List<List<Integer>> temp = new ArrayList<>();
        for(int i=0;i<L;i++)
            for(int j=0;j<W;j++)
                if(pac[i][j] && atl[i][j])
                    temp.add(List.of(i,j));
                    
        return temp;
    }

    public void dfs(int l, int w, boolean[][] list,int prevHeight,int[][] heights) 
    {
        if( l<0 || w<0 || l>=L || w>=W || list[l][w] 
        || heights[l][w]<prevHeight)
            return;
        list[l][w]=true;
        dfs(l+1, w, list,heights[l][w],heights);
        dfs(l-1, w, list,heights[l][w],heights);
        dfs(l, w+1, list,heights[l][w],heights);
        dfs(l, w-1, list,heights[l][w],heights);
    }
}