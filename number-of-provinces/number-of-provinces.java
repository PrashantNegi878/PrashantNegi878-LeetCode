class Solution {
    public int findCircleNum(int[][] isConnected) {
        int l=isConnected.length;
        boolean[] visited = new boolean[l];
        int provinces=0;
        for(int i=0;i<l;i++)
        {
            if(!visited[i])
            {
                provinces+=1;
                dfs(i,l,isConnected,visited);
            }
        }
        return provinces;
    }

    public void dfs(int i,int l, int[][] isConnected, boolean[] visited) {
        visited[i]=true;
        List<Integer> adjacent = new ArrayList<Integer>();
        for(int j=0;j<l;j++)
        {
            if(isConnected[i][j]==1)
                adjacent.add(j);
        }

        for(int curr : adjacent)
        {
            if(!visited[curr])
                dfs(curr,l,isConnected,visited);
        }
    }
}